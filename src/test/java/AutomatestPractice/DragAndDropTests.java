package AutomatestPractice;

import Pages.DragDrop;
import Templates.TestCase;
import org.testng.annotations.Test;

@Test
public class DragAndDropTests extends TestCase {
    public void testDragAndDrop() {
        // Navigate to the drag and drop page
        bot.navigateTo("https://jqueryui.com/resources/demos/droppable/default.html");
        // Create an instance of the DragDrop page object
        DragDrop dragDrop = new DragDrop(bot);
        // Perform the drag and drop action
        dragDrop.DragAndDrop();
        dragDrop.AssertDropped();
    }
}
