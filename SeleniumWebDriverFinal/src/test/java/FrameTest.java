import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FrameTest {
    public WebDriver driver;

    @Test
    public void workWithFrame() {

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        String leftFrameText = driver.findElement(By.tagName("body")).getText();
        Assert.assertEquals(leftFrameText, "LEFT");
    }

    @Test
    public void workWithWindows() {

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/windows");
        String initialHandle = driver.getWindowHandle();

        driver.findElement(By.cssSelector("[href='/windows/new']")).click();

        String newTabHandle = driver.getWindowHandles().toArray()[1].toString();

        driver.switchTo().window(newTabHandle);

        String text = driver.findElement(By.tagName("h3")).getText();

        Assert.assertEquals(text, "New Window");

        driver.close();
        driver.switchTo().window(initialHandle);
    }

    @Test
    public void workWithShadowDom() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));

        driver.get("https://canvas.apps.chrome/");
        WebElement drawingApp = driver.findElement(By.id("drawing-app"));

        String initialWindow = driver.getWindowHandle();

        SearchContext drawingAppSR = getShadowRoot(drawingApp);
        WebElement welcomeDialog = drawingAppSR.findElement(By.cssSelector("welcome-dialog"));

        SearchContext welcomeDialogSR = getShadowRoot(welcomeDialog);

        WebElement getStartedButton = welcomeDialogSR.findElement(By.cssSelector("#get-started"));
        Thread.sleep(3000);
        getStartedButton.click();
        Thread.sleep(3000);

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.close();
        driver.switchTo().window(initialWindow);

        WebElement drawingCanvas = drawingAppSR.findElement(By.cssSelector("drawing-canvas"));
        SearchContext drawingCanvasSR = getShadowRoot(drawingCanvas);

        WebElement canvas = drawingCanvasSR.findElement(By.cssSelector("canvas"));

        Thread.sleep(3000);
        Actions actions = new Actions(driver);

        actions.moveToElement(canvas).clickAndHold()
                .moveByOffset(100,0)
                .moveByOffset(0,100)
                .moveByOffset(-100,0)
                .moveByOffset(0,-100)
                .release()
                .perform();
    }

    private SearchContext getShadowRoot(WebElement rootElement) {
        return (SearchContext)((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot", rootElement);
    }

    @AfterMethod
    public void closeDrive(){
        driver.quit();
    }
}

