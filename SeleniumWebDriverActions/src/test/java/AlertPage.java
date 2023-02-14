import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertPage {
    private By alertButton = By.cssSelector("[onclick='jsAlert()']");
    private By confirmButton = By.cssSelector("[onclick='jsConfirm()']");
    private By promtButton = By.cssSelector("[onclick='jsPrompt()']");
    private By result = By.cssSelector("#result");

    private WebDriver driver;

    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButtonAllert(){
        driver.findElement(alertButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void checkResultButtonAllert(String expected){
        Assert.assertEquals(driver.findElement(result).getText(),expected);
    }

    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void checkResultConfirmButton(String expected){
        Assert.assertEquals(driver.findElement(result).getText(),expected);
    }

    public void clickConfirmButtonNo(){
        driver.findElement(confirmButton).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void checkResultConfirmButtonNo(String expected){
        Assert.assertEquals(driver.findElement(result).getText(),expected);
    }

    public void clickPromptButton(){
        driver.findElement(promtButton).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("I am Groot");
        alert.accept();
    }

    public void checkResultPromptButton(String expected){
        Assert.assertEquals(driver.findElement(result).getText(),expected);
    }
}
