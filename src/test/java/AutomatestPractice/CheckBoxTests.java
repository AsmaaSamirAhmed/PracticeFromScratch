package AutomatestPractice;

import Pages.HerokuApp;
import Templates.TestCase;
import org.testng.annotations.Test;

@Test
public class CheckBoxTests extends TestCase {
    public void CheckBoxIsChecked() {
        HerokuApp herokuApp = new HerokuApp(bot);
        bot.navigateTo("http://the-internet.herokuapp.com/checkboxes");
        herokuApp.CheckCheckBox1();
        herokuApp.AssertBothChecked();
        //trigger github actions

    }
}
