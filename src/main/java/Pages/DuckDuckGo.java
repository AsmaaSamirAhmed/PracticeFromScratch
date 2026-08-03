package Pages;

import engine.ActionsBot;
import org.openqa.selenium.By;

public class DuckDuckGo {
    ActionsBot actionsBot;
    By logo = By.xpath("(//a[@title='Learn about DuckDuckGo']//img)[2]");
    By SearchInput = By.id("searchbox_input");
    By SecondLink = By.xpath("(//a[@data-testid='result-title-a'])[2]");
    public DuckDuckGo(ActionsBot actionsBot) {
        this.actionsBot = actionsBot;
    }

    public DuckDuckGo navigateTo(String url) {
        actionsBot.navigateTo(url);
        return this;
    }

    public DuckDuckGo search(String text) {
        actionsBot.type(SearchInput, text);
        return this;
    }

    public DuckDuckGo assertLogo() {
        actionsBot.checkLogo(logo);
        return this;
    }
    public DuckDuckGo checkSecondLinkContainsCucumber(String url) {
        actionsBot.checkLink(SecondLink,url);
        return this;
    }
}
