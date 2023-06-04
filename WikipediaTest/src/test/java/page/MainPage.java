package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {


    private WebDriver driver;
    private final By mainPageButton = By.xpath("//*[@id=\"n-mainpage-description\"]");
    private final By mainPageTitle = By.xpath("//*[@id=\"Добро_пожаловать_в_Википедию,\"]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMainPageButton() {
        driver.findElement(mainPageButton).click();
    }
    public String checkTitle() {
        String text = driver.findElement(mainPageTitle).getText();
        return text;
    }
}

