import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsTest {
    WebDriver driver = new ChromeDriver();
    DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);

    @BeforeTest(description = "Вход на сайт")
    public void create() {
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
    }

    @Test(description = "Наложение одного объекта на второй")
    public void movingAnOject() {
        dragAndDropPage.moveAndElements();
    }

    @AfterTest(description = "Закрытие браузера")
    public void quit(){
        driver.quit();
    }

}
