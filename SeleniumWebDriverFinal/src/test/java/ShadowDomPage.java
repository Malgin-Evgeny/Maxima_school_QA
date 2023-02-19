import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ShadowDomPage {

    private By drawingAppLocator = By.id("drawing-app");
    private By welcomeDialogLocator = By.cssSelector("welcome-dialog");
    private By startedButton = By.cssSelector("#get-started");
    private By drawingCanvasLocator = By.cssSelector("drawing-canvas");
    private By canvasLocator = By.cssSelector("canvas");
    private String urlShadowPage = "https://canvas.apps.chrome/";
    WebDriver driver;

    SearchContext drawingAppSR;
    SearchContext welcomeDialogSR;
    WebElement canvas;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    String initialWindow = driver.getWindowHandle();

    public ShadowDomPage(WebDriver driver){
        this.driver = driver;
    }

    public SearchContext joinDrawingaAppRoot(){
        driver.get(urlShadowPage);
        WebElement drawingApp = driver.findElement(drawingAppLocator);
        drawingAppSR = getShadowRoot(drawingApp);
        return drawingAppSR;
    }

    public SearchContext joinWelcomeDialogRoot() {
        WebElement welcomeDialog = drawingAppSR.findElement(welcomeDialogLocator);
        welcomeDialogSR = getShadowRoot(welcomeDialog);
        return welcomeDialogSR;
    }

    public  void clickStartedButton(){
        WebElement getStartedButton = welcomeDialogSR.findElement(startedButton);
        wait.until(ExpectedConditions.visibilityOf(getStartedButton));
        getStartedButton.click();
    }

    public void swithInitialWindow(){
        wait.until(driver -> driver.getWindowHandles().toArray().length > 1);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        driver.close();
        driver.switchTo().window(initialWindow);
    }

    public SearchContext joinDrawingCanvasRoot(){
        WebElement drawingCanvas = drawingAppSR.findElement(drawingCanvasLocator);
        SearchContext drawingCanvasSR = getShadowRoot(drawingCanvas);
        canvas = drawingCanvasSR.findElement(canvasLocator);
        wait.until(ExpectedConditions.visibilityOf(canvas));
        return canvas;
    }

    public void drawSquare()  {
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
}
