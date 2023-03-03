import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SubcategoryPage {
    private By nameButton = By.cssSelector(".button[href$=name]");
    private By priceButton = By.cssSelector(".button.active");
    private By popularityButton = By.cssSelector(".button[href$=popularity]");
    private By dateButton = By.cssSelector(".button[href$=date]");
    private By stikerNew = By.cssSelector(".sticker.new");
    private By stikerSale = By.cssSelector(".sticker.sale");
    private WebDriver driver;
    private List<String> expectedList = new ArrayList<>();
    private List<String> actualList = new ArrayList<>();

    public SubcategoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButtonName(){
        driver.findElement(nameButton).click();
    }

    public List<String> sortingExpectedName() {
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");
        return expectedList;
    }
    public List<String> sortingActualName() {
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        return actualList;
    }

    public void clickButtonPrice(){
        driver.findElement(priceButton).click();
    }
    public List<String> sortingExpectedPrice() {
        expectedList.add("$18");
        expectedList.add("$20");
        return expectedList;
    }
    public List<String> sortingActualPrice() {
        List<WebElement> elements = driver.findElements(By.cssSelector(".price-wrapper :last-child"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        return actualList;
    }

    public void clickButtonPopularity(){
        driver.findElement(popularityButton).click();
    }

    public List<String> sortingExpectedPopularity() {
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");
        return expectedList;
    }
    public List<String> sortingActualPopularity(){
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        return actualList;
    }

    public void clickButtonDate(){
        driver.findElement(dateButton).click();
    }
    public List<String> checkexpectedSortingDate() {
        expectedList.add("Yellow Duck");
        expectedList.add("Green Duck");
        return expectedList;
    }
    public List<String>checkactualSortingDate() {
        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        return actualList;
    }

    public String getStikerNew(){
        String textStikerNew = driver.findElement(stikerNew).getText();
        return textStikerNew;
    }

    public String getStikerSale(){
        String textStikerSale = driver.findElement(stikerSale).getText();
        return textStikerSale;
    }
}
