package Fluent;

public class ShopMainPage {
    public ShopMainPage shopMainPage;

    public ShopMainPage() {
    }
    public ShopMainPage search(SerchEntity entity){
        return this;
    }
    public boolean isEntityFound(){
        return true;
    }
}
