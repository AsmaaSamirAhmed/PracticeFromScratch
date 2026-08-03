package AutomatestPractice;

import Pages.DuckDuckGo;
import Templates.TestCase;
import org.testng.annotations.Test;

@Test
public class DuckDuckGoTests extends TestCase {
    public void checkDuckDuckGoLogo() {
        DuckDuckGo duckDuckGo = new DuckDuckGo(bot);
        duckDuckGo.navigateTo("https://duckduckgo.com/")
                .assertLogo();
    }

    public void checkResultContainsCucmberDocs() {
        DuckDuckGo duckDuckGo = new DuckDuckGo(bot);
        duckDuckGo.navigateTo("https://duckduckgo.com/")
                .search("Cucumber IO")
                .checkSecondLinkContainsCucumber("https://cucumber.io/docs/");
    }
}
