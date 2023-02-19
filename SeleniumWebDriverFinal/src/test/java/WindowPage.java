import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WindowPage {
    private String urlWindowPage = "https://the-internet.herokuapp.com/windows";
    private By linkClickHere = By.cssSelector("[href='/windows/new']");
    private By textNewWindow = By.tagName("h3");
    private WebDriver driver;

    public WindowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkHere() {
        driver.get(urlWindowPage);
        driver.findElement(linkClickHere).click();
    }

    public void swithNewWindow(){
        String newTabHandle = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTabHandle);
    }

    public void checkTransition(String expected) {
        Assert.assertEquals(driver.findElement(textNewWindow).getText(), expected);
    }
}
