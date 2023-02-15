import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MainPage {

    private By element = By.cssSelector("#site-menu .category-1");
    private By element2 = By.cssSelector(".category-2");

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void joinSubcategoryPage (){
        Actions actions = new Actions(driver);
        actions .moveToElement(driver.findElement(element))
                .click(driver.findElement(element2))
                .build()
                .perform();
    }
}

