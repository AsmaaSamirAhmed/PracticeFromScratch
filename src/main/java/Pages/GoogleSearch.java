package Pages;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GoogleSearch {
    ActionsBot actionsBot;
    By searchBox = By.name("q");
    By firstLink = By.name("q");

    public GoogleSearch(ActionsBot actionsBot) {
        this.actionsBot = actionsBot;
    }
    public GoogleSearch assertCurrentUrl(String CurrentUrl, String actualUrl) {
        Assert.assertEquals(CurrentUrl, actionsBot.getURL(), "The current URL does not match the expected URL.");
        return this;
    }
    public GoogleSearch assertCurrentTitle() {
        Assert.assertEquals(actionsBot.getTitle(), "Google", "The current title does not match the expected title.");
        return this;
    }
}
