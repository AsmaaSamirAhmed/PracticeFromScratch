package Pages;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CountryCompany {
    ActionsBot actionsBot;
    public CountryCompany(ActionsBot actionsBot) {
        this.actionsBot = actionsBot;
    }
    By country =By.xpath("//td[text()='Ernst Handel']//following-sibling::td[2]");
    public void GetCountryOfCompany() {
        String countryText = actionsBot.getText(country);
        Assert.assertEquals(countryText, "Austria", "The country of the company is not as expected.");
    }
}
