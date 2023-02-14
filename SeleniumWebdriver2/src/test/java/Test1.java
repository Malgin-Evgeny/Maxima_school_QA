import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test1 {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void create() {

        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test
    public void joinHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.setButtonHome();

    }

    @Test
    public void joinRubberDucksPage() {

        HomePage homePage = new HomePage(driver);
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);

        homePage.setButtonRubberDucks();

        Assert.assertTrue(rubberDucksPage.titleIsVisible(),"Tittle is not visible ");
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}


