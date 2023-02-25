import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    private By element = By.cssSelector("#draggable.ui-widget-content");
    private By element2 = By.cssSelector("#droppable.ui-widget-header");
    private WebDriver driver;

    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveAndElements (){
        Actions actions = new Actions(driver);
        actions .moveToElement(driver.findElement(element))
                .clickAndHold()
                .moveToElement(driver.findElement(element2))
                .build()
                .perform();
    }
}
