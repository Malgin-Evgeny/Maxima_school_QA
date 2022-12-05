public class HomePage extends BasePage{

    public  boolean isImportantLabelAvaliable(){
        System.out.println("HomePage.isImportantLabelAvaliable" + important_label);
        return true;
    }
    private WebElement important_label = new WebElement("Important Label locator");
}
