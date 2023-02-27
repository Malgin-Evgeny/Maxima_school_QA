import Fluent.Credentials;
import Fluent.LoginPage;
import Fluent.SearchShopDescription;
import Fluent.SerchEntity;

public class Main {
    public static void main(String[] args) {

        System.out.println("==============Build================= \n");
        Request currentReq = new Request();
        currentReq.addCoocies("Куки")
                .addUserOptions("Юзера")
                .addBrowserOptions("Браузера")
                .addNetworkOptions("Нетворка")
                .addPCOptions("Пк \n");

        Request currentReqa = Request.buildReuest()
                .addCoocies("Куки")
                .addUserOptions("Юзера")
                .addBrowserOptions("Браузера")
                .addNetworkOptions("Нетворка")
                .addPCOptions("Пк");


        Credentials credentials                      = new Credentials();
        SearchShopDescription searchShopDescription  = new SearchShopDescription();
        SerchEntity entity                           = new SerchEntity();
        LoginPage loginPage                          = new LoginPage();

        //@Test
        assert (loginPage.login(credentials)
                .openMenu()
                .selectShop(searchShopDescription)
                .enterShop()
                .shopMainPage.search(entity)
                .isEntityFound());
    }
}