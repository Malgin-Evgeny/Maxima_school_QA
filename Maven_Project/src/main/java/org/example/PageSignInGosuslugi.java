package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageSignInGosuslugi {

    private final WebDriver driver;

    public PageSignInGosuslugi(WebDriver driver) {
        this.driver = driver;
    }

    private final String byFieldLogin = "#login.plain-input";

    private final String byFieldPassword = "#password.plain-input";

    private final String byButtonSignIn = ".plain-button.plain-button_wide";

    public PageSignInGosuslugi fillFieldLogin(String value) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(byFieldLogin)));
        WebElement fieldLogin = driver.findElement(By.cssSelector(byFieldLogin));
        fieldLogin.sendKeys(value);
        return this;
    }

    public PageSignInGosuslugi fillFieldPassword(String value) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(byFieldPassword)));
        WebElement fieldPassword = driver.findElement(By.cssSelector(byFieldPassword));
        fieldPassword.sendKeys(value);
        return this;
    }

    public PageSignInGosuslugi clickButtonSignIn() {
        WebElement buttonSignIn = driver.findElement(By.cssSelector(byButtonSignIn));
        buttonSignIn.click();
        return this;
    }
}
