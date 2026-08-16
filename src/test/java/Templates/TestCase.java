package Templates;

import Utils.ConfigReader;
import engine.ActionsBot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestCase {
    public ActionsBot bot;
    WebDriver driver;
    Wait<WebDriver> wait;

    @BeforeMethod
    public void setup() {
        String browser = ConfigReader.getProperty("browser");
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver(chromeOptions());
                break;
            case "firefox":
                driver = new FirefoxDriver(fireFoxOptions());
                break;
        }
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class)
                .ignoring(NotFoundException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(AssertionError.class)
                .ignoring(StaleElementReferenceException.class);

        bot = new ActionsBot(wait);
    }

    @AfterMethod
    public void teardown() {
        bot.quit();
    }

    public static ChromeOptions chromeOptions() {
        ChromeOptions options = new ChromeOptions();

        // Essential execution mode (use new headless mode if available)
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        // Override default headless UA (contains "HeadlessChrome") with a normal desktop Chrome UA.
// Without this, the target site detects headless mode and serves a different page
// (no results / block page), causing NoSuchElementException on result-title-a.
// or derive it dynamically via navigator.userAgent instead of hardcoding.
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36");

        // CI/CD-specific stability
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Performance & consistency
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size=1920,1080");

        return options;
    }

    public static FirefoxOptions fireFoxOptions() {
        FirefoxOptions optionsFireFox = new FirefoxOptions();

        // 1. Run browser in Headless Mode (no GUI)
        optionsFireFox.addArguments("-headless");

        // 2. Set Page Load Strategy
        optionsFireFox.setPageLoadStrategy(PageLoadStrategy.NORMAL); // NORMAL, EAGER, or NONE

        // 3. Accept Untrusted/Insecure SSL Certificates
        optionsFireFox.setAcceptInsecureCerts(true);

        // 4. Configure Firefox Custom Profile Settings (about:config preferences)
        FirefoxProfile profile = new FirefoxProfile();

        // Example: Disable browser notifications
        profile.setPreference("dom.webnotifications.enabled", false);

        // Example: Set custom download directory
        profile.setPreference("browser.download.folderList", 2); // 2 = custom location
        profile.setPreference("browser.download.dir", "C:\\SeleniumDownloads");
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,application/octet-stream");

        // Attach profile to options
        optionsFireFox.setProfile(profile);

        return optionsFireFox;
    }
}