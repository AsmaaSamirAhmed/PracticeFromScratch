package Pages;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragDrop {
    ActionsBot actionsBot;
    By Drag=By.id("draggable");
    By Drop=By.id("droppable");
    By Dropped=By.xpath("//div[@id='droppable']//p");
    public DragDrop(ActionsBot actionsBot) {
        this.actionsBot = actionsBot;
    }
    public void DragAndDrop() {
        actionsBot.dragAndDrop(Drag, Drop);
    }
    public void AssertDropped() {
        String droppedText = actionsBot.getText(Dropped);
        Assert.assertEquals(droppedText, "Dropped!", "The text after dropping is not as expected.");
    }
}
