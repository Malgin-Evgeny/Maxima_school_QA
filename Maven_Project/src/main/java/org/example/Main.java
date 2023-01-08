package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980,1020));
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        try {
            new PageGosuslugi(driver)
                    .clickButtonSignInWindow()
                    .fillFieldLogin("123456")
                    .fillFieldPassword("Test123")
                    .clickButtonSignIn();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}