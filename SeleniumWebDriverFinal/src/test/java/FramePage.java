import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FramePage {
    private By textLeftFrame = By.tagName("body");
    private String urlFramePage = "https://the-internet.herokuapp.com/nested_frames";

    WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void swithFrameMain() {
        driver.get(urlFramePage);
        driver.switchTo().frame("frame-top");
    }

    public void swithFrameLeft() {
        driver.switchTo().frame("frame-left");
    }

    public void checkTransition(String expected){
        Assert.assertEquals(driver.findElement(textLeftFrame).getText(),expected);
    }
}
