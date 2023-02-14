import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private By buttonHome = By.cssSelector(".fa.fa-home");
    private By buttonRubberDucks = By.cssSelector("#site-menu .category-1");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setButtonHome (){
        driver.findElement(buttonHome).click();
    }

    public void setButtonRubberDucks() {
        driver.findElement(buttonRubberDucks).click();
    }
}
