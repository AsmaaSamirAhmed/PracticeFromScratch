package Pages;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;

public class HerokuApp {
    ActionsBot actionsBot;

    public HerokuApp(ActionsBot actionsBot) {
        this.actionsBot = actionsBot;

    }

    By CheckBox1 = By.xpath("//input[following-sibling::text()[normalize-space()='checkbox 1']]");
    By CheckBox2 = By.xpath("(//input[following-sibling::text()[normalize-space()='checkbox 2']])[2]");
    By ChooseFileBTN = By.id("file-upload");
    By SubmitFileBTN = By.id("file-submit");
    By UploadedFile = By.xpath("//div[@class='example']//h3");

    public void CheckCheckBox1() {
        actionsBot.click(CheckBox1);
    }

    public void AssertBothChecked() {
        actionsBot.AssertCheckBoxChecked(CheckBox1);
        actionsBot.AssertCheckBoxChecked(CheckBox2);
    }

    public void uploadImage() {
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\Screenshot.png";
        System.out.println(path);
        actionsBot.type(ChooseFileBTN, path);
        actionsBot.click(SubmitFileBTN);
    }

    public void AssertFileUploaded() {
        String uploadedText = actionsBot.getText(UploadedFile);
        Assert.assertEquals(uploadedText, "File Uploaded!");
    }
}
