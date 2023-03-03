import org.testng.Assert;
import org.testng.annotations.Test;

public class SubcategoryPageTest extends BeforeAndAfter {

    @Test(description = "Тест сортировки по имени")
    public void sortingByName(){
        subcategoryPage.clickButtonName();
        Assert.assertEquals(subcategoryPage.sortingActualName(),
                            subcategoryPage.sortingExpectedName());
    }

    @Test(description = "Тест сортировки по цене")
    public void sortingByPrice() {
        subcategoryPage.clickButtonPrice();
        Assert.assertEquals(subcategoryPage.sortingActualPrice(),
                            subcategoryPage.sortingExpectedPrice());
    }

    @Test(description = "Тест сортировки по популярности")
    public void sortingByPopularity(){
        subcategoryPage.clickButtonPopularity();
        Assert.assertEquals(subcategoryPage.sortingActualPopularity(),
                            subcategoryPage.sortingExpectedPopularity());
    }

    @Test(description = "Тест сортировки по дате")
    public void sortingByDate(){
        subcategoryPage.clickButtonDate();
        Assert.assertEquals(subcategoryPage.checkactualSortingDate(),
                            subcategoryPage.checkexpectedSortingDate());
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
