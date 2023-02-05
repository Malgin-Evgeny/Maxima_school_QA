import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {
    @Test
    public void openAlert() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsAlert()']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You successfully clicked an alert");

        driver.quit();
    }

    @Test
    public void openConfirmYes() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You clicked: Ok");

        driver.quit();
    }

    @Test
    public void openConfirmDismiss() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You clicked: Cancel");

        driver.quit();
    }

    @Test
    public void openPromt() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));
        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("I am Groot");
        alert.accept();

        Assert.assertEquals(driver.findElement(By.cssSelector("#result"))
                .getText(), "You entered: I am Groot");

        driver.quit();
    }

}
