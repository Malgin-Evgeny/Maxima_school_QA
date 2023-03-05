import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAndAfter {
    WebDriver driver;
    SubcategoryPage subcategoryPage;

    @BeforeMethod(description = "Вход на сайт")
    public void create() {
        driver = new ChromeDriver();
        subcategoryPage = new SubcategoryPage(driver);
    }

    @AfterMethod(description = "Закрытие браузера")
    public void quit() {
        driver.quit();
    }
}

