import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test1 {
    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);

    @BeforeTest
    public void create() {
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test
    public void joinHomePage() {
        homePage.clickButtonRubberDucks();
        Assert.assertEquals(driver.getCurrentUrl(), "https://litecart.stqa.ru/en/rubber-ducks-c-1/");
        homePage.clickButtonHome();
        Assert.assertEquals(driver.getCurrentUrl(), "https://litecart.stqa.ru/en/");
    }

    @Test
    public void joinRubberDucksPage() {
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);
        homePage.clickButtonRubberDucks();
        Assert.assertTrue(rubberDucksPage.titleIsVisible(), "Tittle is not visible ");
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}


