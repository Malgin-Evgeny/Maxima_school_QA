package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.gosuslugi.ru/");

        WebElement linkToCheckboxesOne = driver.findElement(By.cssSelector(".button.font-[tabindex=\"11\"]"));
        linkToCheckboxesOne.click();

        WebElement linkToCheckboxesTwo = driver.findElement(By.cssSelector("#login.plain-input"));
        linkToCheckboxesTwo.sendKeys("79527778855");

        WebElement linkToCheckboxesThree = driver.findElement(By.cssSelector("#password.plain-input"));
        linkToCheckboxesThree.sendKeys("Test1234");

        WebElement linkToCheckboxes = driver.findElement(By.cssSelector(".plain-button.plain-button_wide"));
        linkToCheckboxes.click();
        driver.quit();




    }
}