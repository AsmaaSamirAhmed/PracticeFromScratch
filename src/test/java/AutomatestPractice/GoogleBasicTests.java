package AutomatestPractice;

import Pages.GoogleSearch;
import Templates.TestCase;
import Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleBasicTests extends TestCase {
    @Test
    public void checkGooglePageUrl() {
        bot.navigateTo(ConfigReader.getProperty("GoogleURL"));
        new GoogleSearch(bot)
                .assertCurrentUrl("https://www.google.com/", bot.getURL());
    }
    @Test
    public void checkGooglePageTitle() {
        bot.navigateTo(ConfigReader.getProperty("GoogleURL"));
        new GoogleSearch(bot).assertCurrentTitle();
    }

}
