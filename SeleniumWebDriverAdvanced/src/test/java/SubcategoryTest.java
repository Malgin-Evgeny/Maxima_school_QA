import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SubcategoryTest extends BeforeAndAfter {

    @BeforeMethod
    public void join(){
        driver.manage().window().setSize(new Dimension(1980, 1020));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");
    }

    @Test(description = "Тест сортировки по имени")
    public void sortingByName(){
        subcategoryPage.clickButtonName();
        List<String> actualList = subcategoryPage.sortingExpectedName();
        List<String> expectedList = subcategoryPage.sortingExpectedName();

        Assert.assertEquals(actualList,expectedList);
    }

    @Test(description = "Тест сортировки по цене")
    public void sortingByPrice() {
        subcategoryPage.clickButtonPrice();
        List<String> actualList = subcategoryPage.sortingActualPrice();
        List<String> expectedList = subcategoryPage.sortingExpectedPrice();

        Assert.assertEquals(actualList,expectedList);
    }

    @Test(description = "Тест сортировки по популярности")
    public void sortingByPopularity(){
        subcategoryPage.clickButtonPopularity();
        List<String> actualList = subcategoryPage.sortingActualPopularity();
        List<String> expectedList = subcategoryPage.sortingExpectedPopularity();

        Assert.assertEquals(actualList,expectedList);
    }

    @Test(description = "Тест сортировки по дате")
    public void sortingByDate(){
        subcategoryPage.clickButtonDate();
        List<String> actualList = subcategoryPage.checkactualSortingDate();
        List<String> expectedList = subcategoryPage.checkexpectedSortingDate();

        Assert.assertEquals(actualList,expectedList);
    }

    @Test(description = "Тест на проверку лейбла “New”")
    public void findNew() {
        String expected = "NEW";
        Assert.assertEquals(subcategoryPage.getStikerNew(),expected);
    }

    @Test(description = "Тест на проверку лейбла “Sale”")
    public void findSale() {
        String expected = "SALE";
        Assert.assertEquals(subcategoryPage.getStikerSale(),expected);
    }
}
