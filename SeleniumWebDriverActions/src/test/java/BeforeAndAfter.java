import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeAndAfter {
    WebDriver driver = new ChromeDriver();

    @BeforeTest(description = "Вход на сайт")
    public void create() {
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @AfterTest(description = "Закрытие браузера")
    public void quit(){
        driver.quit();
    }
}
