import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void joinDragAndDropPage() {
        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://the-internet.herokuapp.com");

        mainPage.setList(10);

        driver.quit();
    }
}


