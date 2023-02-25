import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
    public List<String> expectedList = new ArrayList<>();
    public List<String> actualList = new ArrayList<>();

    public SubcategoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickButtonName(){
        driver.findElement(nameButton).click();
    }

    public void sortingName() {
        expectedList.add("Green Duck");
        expectedList.add("Yellow Duck");

        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
    }

    public void clickButtonPrice(){
        driver.findElement(priceButton).click();
    }
    public void sortingPrice() {
        expectedList.add("$18");
        expectedList.add("$20");

        List<WebElement> elements = driver.findElements(By.cssSelector(".price-wrapper :last-child"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
    }

    public void clickButtonPopularity(){
        driver.findElement(popularityButton).click();
    }

    public void sortingPopularity(){
        expectedList.add("Yellow Duck");
        expectedList.add("Green Duck");

        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
    }

    public void clickButtonDate(){
        driver.findElement(dateButton).click();
    }
    public void checkSortingDate(){
        expectedList.add("Yellow Duck");
        expectedList.add("Green Duck");

        List<WebElement> elements = driver.findElements(By.className("name"));
        for (WebElement e : elements) {
            actualList.add(e.getText());
        }
        Assert.assertEquals(actualList,expectedList);
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
