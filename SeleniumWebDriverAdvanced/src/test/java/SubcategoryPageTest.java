import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SubcategoryPageTest extends BeforeAndAfter {

    @Test(description = "Тест сортировки по имени")
    public void sortingByName(){
        subcategoryPage.clickButtonName();
        subcategoryPage.sortingName();
        List<String> expected = subcategoryPage.expectedList;
        List<String> actual = subcategoryPage.actualList;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Тест сортировки по цене")
    public void sortingByPrice(){
        subcategoryPage.clickButtonPrice();
        subcategoryPage.sortingPrice();
        List<String> expected = subcategoryPage.expectedList;
        List<String> actual = subcategoryPage.actualList;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Тест сортировки по популярности")
    public void sortingByPopularity(){
        subcategoryPage.clickButtonPopularity();
        subcategoryPage.sortingPopularity();
        List<String> expected = subcategoryPage.expectedList;
        List<String> actual = subcategoryPage.actualList;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Тест сортировки по дате")
    public void sortingByDate(){
        subcategoryPage.clickButtonDate();
        subcategoryPage.checkSortingDate();
        List<String> expected = subcategoryPage.expectedList;
        List<String> actual = subcategoryPage.actualList;
        Assert.assertEquals(actual, expected);
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
