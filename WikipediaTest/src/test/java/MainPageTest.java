import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MainPage;

public class MainPageTest extends BaseTest{

    MainPage mainPage;

    @BeforeMethod
    public void init() {
        mainPage = new MainPage(driver);
    }
    @Test
    public void clickButtonDocuments() {
        LOG.info("Проверяем кнопку Заглавная страница");
        mainPage.clickMainPageButton();
        Assert.assertEquals(mainPage.checkTitle(), "Добро пожаловать в Википедию,");
    }
}
