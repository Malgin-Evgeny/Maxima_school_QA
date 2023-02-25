import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RubberDucksPage {

    private By titlePage = By.cssSelector("#box-category.box>.title");
    private WebDriver driver;

    public RubberDucksPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean titleIsVisible() {
        return driver.findElement(titlePage).isDisplayed();
    }
}

