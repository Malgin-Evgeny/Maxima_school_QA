import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private By listWebElement = By.tagName("a");

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void setList(int index){
        driver.findElements(listWebElement).get(index).click();
    }
}
