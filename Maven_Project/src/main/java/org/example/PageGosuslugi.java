package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageGosuslugi {

    public String URL = "https://www.gosuslugi.ru/";

    private final WebDriver driver;

    public PageGosuslugi(WebDriver driver) {
        this.driver = driver;
        this.driver.get(URL);
    }

    private final String byButtonSignInWindow = ".button.font-[tabindex=\"11\"]";

    public PageSignInGosuslugi clickButtonSignInWindow() {
        WebElement buttonSignInWindow = driver.findElement(By.cssSelector(byButtonSignInWindow));
        buttonSignInWindow.click();
        return new PageSignInGosuslugi(driver);
    }


}
