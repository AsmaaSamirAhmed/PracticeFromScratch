package AutomatestPractice;

import Pages.HerokuApp;
import Templates.TestCase;
import Utils.ConfigReader;
import org.testng.annotations.Test;

@Test
public class CheckBoxTests extends TestCase {
    public void CheckBoxIsChecked() {
        HerokuApp herokuApp = new HerokuApp(bot);
        bot.navigateTo(ConfigReader.getProperty("CheckboxURL"));
        herokuApp.CheckCheckBox1();
        herokuApp.AssertBothChecked();


    }
}
