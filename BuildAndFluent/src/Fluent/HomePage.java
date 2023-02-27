package Fluent;

public class HomePage {
    public HomePage() {
    }
    public HomePage openMenu(){
        return this;
    }
    public HomePage selectShop(SearchShopDescription searchShopDescription){
        return this;
    }
    public ShopMainPage enterShop(){
        return new ShopMainPage();
    }
}
