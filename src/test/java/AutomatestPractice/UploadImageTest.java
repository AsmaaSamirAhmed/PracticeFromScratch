package AutomatestPractice;

import Pages.HerokuApp;
import Templates.TestCase;
import Utils.ConfigReader;
import org.testng.annotations.Test;

@Test
public class UploadImageTest extends TestCase {
  public void testUploadImage() {
      HerokuApp herokuApp = new HerokuApp(bot);
    // Navigate to the upload page
    bot.navigateTo(ConfigReader.getProperty("HerokuAppUploadURL"));
    herokuApp.uploadImage();
    herokuApp.AssertFileUploaded();

  }
}
