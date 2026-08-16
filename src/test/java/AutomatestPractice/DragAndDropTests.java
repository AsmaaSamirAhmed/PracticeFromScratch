package AutomatestPractice;

import Pages.DragDrop;
import Templates.TestCase;
import Utils.ConfigReader;
import org.testng.annotations.Test;

@Test
public class DragAndDropTests extends TestCase {
    public void testDragAndDrop() {
        // Navigate to the drag and drop page
        bot.navigateTo(ConfigReader.getProperty("DragAndDropURL"));
        // Create an instance of the DragDrop page object
        DragDrop dragDrop = new DragDrop(bot);
        // Perform the drag and drop action
        dragDrop.DragAndDrop();
        dragDrop.AssertDropped();
    }
}
