package engine;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class ActionsBot {
    Wait<WebDriver> wait;

    public ActionsBot(Wait<WebDriver> wait) {
        this.wait = wait;
    }

    public ActionsBot navigateTo(String url) {
        wait.until(d -> {
            d.navigate().to(url);
            System.out.println("Navigated to: " + url);
            return true;
        });
        return this;
    }

    // Implementation for click action
    public ActionsBot click(By locator) {
        wait.until(d -> {
            d.findElement(locator).click();
            System.out.println("Clicked: " + locator);
            return true;
        });
        return this;
    }

    public ActionsBot type(By locator, String text) {
        wait.until(d -> {
            d.findElement(locator).sendKeys(text);
            System.out.println("Text entered: " + text);
            return true;
        });
        return this;
    }
public ActionsBot typeWithSendKeys(By locator, String text) {
        wait.until(d ->{
            d.findElement(locator).sendKeys(text, Keys.ENTER);
            System.out.println("Text entered using sendKeys: " + text);
            return true;
        });
        return this;
}
    public void checkLogo(By locator) {
        wait.until(d -> {
            boolean isLogoDisplayed = d.findElement(locator).isDisplayed();
            System.out.println("Logo is displayed: " + isLogoDisplayed);
            return isLogoDisplayed;
        });

    }

    public void checkLink(By locator, String url) {
        wait.until(d -> {
            System.out.println(d.getPageSource());
            String linkText = d.findElement(locator).getDomAttribute("href");
            System.out.println("Link text: " + linkText);
            Assert.assertTrue(linkText.contains(url), "The link does not contain the expected URL: " + url);
            return linkText;
        });
    }

    public void AssertCheckBoxChecked(By locator) {
        wait.until(d -> {
            boolean isChecked = d.findElement(locator).isSelected();
            System.out.println("Checkbox" + locator + " is checked: " + isChecked);
            Assert.assertTrue(isChecked, "The checkbox is not checked.");
            return isChecked;
        });
    }

    public String getText(By locator) {
        return wait.until(d -> {
            String text = d.findElement(locator).getText();
            System.out.println("Text from element " + locator + ": " + text);
            return text;
        });
    }


    public void dragAndDrop(By draggedlocator, By droplocator) {
        wait.until(d -> {
            Actions actions = new Actions(d);
            actions.dragAndDrop(d.findElement(draggedlocator), d.findElement(droplocator)).perform();
            System.out.println("Dragged element " + draggedlocator + " and dropped on " + droplocator);
            return true;
        });
    }
    public String getURL() {
        return wait.until(d -> {
            String currentUrl = d.getCurrentUrl();
            System.out.println("Current URL: " + currentUrl);
            return currentUrl;
        });
    }
    public String getTitle() {
        return wait.until(d -> {
            String title = d.getTitle();
            System.out.println("Current Title: " + title);
            return title;
        });
    }

    public void quit() {
        wait.until(d -> {
            d.quit();
            System.out.println("Closed Window");
            return true;
        });
    }
}
