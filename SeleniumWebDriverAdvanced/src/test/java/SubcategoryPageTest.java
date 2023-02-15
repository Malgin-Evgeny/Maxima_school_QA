import org.testng.annotations.Test;

public class SubcategoryPageTest extends BeforeAndAfter {

    @Test(description = "Тест сортировки по имени")
    public void sortingByName(){
        subcategoryPage.clickButtonName();

        subcategoryPage.checkSortingName();
    }

    @Test(description = "Тест сортировки по цене")
    public void sortingByPrice(){
        subcategoryPage.clickButtonPrice();

        subcategoryPage.checkSortingPrice();
    }

    @Test(description = "Тест сортировки по популярности")
    public void sortingByPopularity(){
        subcategoryPage.clickButtonPopularity();

        subcategoryPage.checkSortingPopularity();
    }

    @Test(description = "Тест сортировки по дате")
    public void sortingByDate(){
        subcategoryPage.clickButtonDate();

        subcategoryPage.checkSortingDate("Yellow Duck","Green Duck");
    }

    @Test(description = "Тест на проверку лейбла “New”")
    public void findNew() {
        subcategoryPage.checkstikerNew("NEW");
    }

    @Test(description = "Тест на проверку лейбла “Sale”")
    public void findSale() {
        subcategoryPage.checkstikerSale("SALE");
    }
}
