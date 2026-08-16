package AutomatestPractice;

import Pages.DuckDuckGo;
import Templates.TestCase;
import Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DuckDuckGoTests extends TestCase {
    public void checkDuckDuckGoLogo() {
        DuckDuckGo duckDuckGo = new DuckDuckGo(bot);
        duckDuckGo.navigateTo(ConfigReader.getProperty("DuckDuckGoURL"))
                .assertLogo();
    }
public void checkFirstLinkContainsSeleniumWebDriver() {
    DuckDuckGo duckDuckGo = new DuckDuckGo(bot);
    duckDuckGo.navigateTo(ConfigReader.getProperty("DuckDuckGoURL"))
            .search("Selenium WebDriver")
            .checkFisrstResult("https://www.selenium.dev/documentation/webdriver/");
}
    public void checkResultContainsCucmberDocs() {
        DuckDuckGo duckDuckGo = new DuckDuckGo(bot);
        duckDuckGo.navigateTo(ConfigReader.getProperty("DuckDuckGoURL"))
                .search("Cucumber IO")
                .checkSecondLinkContainsCucumber("https://cucumber.io/docs/");
    }
}
