package AutomatestPractice;

import Pages.HerokuApp;
import Templates.TestCase;
import org.testng.annotations.Test;

@Test
public class UploadImageTest extends TestCase {
  public void testUploadImage() {
      HerokuApp herokuApp = new HerokuApp(bot);
    // Navigate to the upload page
    bot.navigateTo("https://the-internet.herokuapp.com/upload");
    herokuApp.uploadImage();
    herokuApp.AssertFileUploaded();

  }
}
