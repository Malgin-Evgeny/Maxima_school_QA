import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JoinSubcategoryTest {
    WebDriver driver = new ChromeDriver();
    MainPage mainPage = new MainPage(driver);

    @BeforeTest(description = "Вход на сайт")
    public void create() {
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test(description = "Переход на страницу с категориями")
    public void joinSubcategoryPage() {
        mainPage.joinSubcategoryPage();
    }

    @AfterTest(description = "Закрытие браузера")
    public void quit(){
        driver.quit();
    }
}
