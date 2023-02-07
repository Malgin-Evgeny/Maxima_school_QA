import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class SubcategoryPageTest {

    @Test
    public void joinSubcategoryPage(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/");

        WebElement element = driver.findElement(By.cssSelector("#site-menu .category-1"));
        WebElement element2 = driver.findElement(By.cssSelector(".category-2"));

        Actions actions = new Actions(driver);
        actions .moveToElement(element)
                .click(element2)
                .build()
                .perform();

        driver.quit();
    }

    @Test
    public void sortingByName(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");
        WebElement element = driver.findElement(By.cssSelector(".button[href$=name]"));
        element.click();

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList,expectedList);

        driver.quit();
    }

    @Test
    public void sortingByPrice(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");
        WebElement element = driver.findElement(By.cssSelector(".button.active"));
        element.click();

        List<String> expectedList = new ArrayList<>();
        expectedList.add("$18");
        expectedList.add("$20");

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".price-wrapper :last-child"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList,expectedList);
        driver.quit();
    }

    @Test
    public void sortingByPopularity(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");
        WebElement element = driver.findElement(By.cssSelector(".button[href$=popularity]"));
        element.click();

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList,expectedList);
        driver.quit();
    }

    @Test
    public void sortingByDate(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");
        WebElement element = driver.findElement(By.cssSelector(".button[href$=date]"));
        element.click();

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Yellow Duck");
        expectedList.add("Green Duck");

        List<String> actualList = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("name"));

        for (WebElement e : elements) {
            actualList.add(e.getText());
        }

        Assert.assertEquals(actualList,expectedList);

        driver.quit();
    }
}
