import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest extends BeforeAndAfter{

    @Test(description = "Проверка фрэймов")
    public void workWithFrame() {
        FramePage framePage = new FramePage(driver);

        framePage.swithFrameMain();
        framePage.swithFrameLeft();

        framePage.checkTransition("LEFT");
    }

    @Test(description = "Проверка переключения окон браузера")
    public void workWithWindows() {
        WindowPage windowPage = new WindowPage(driver);

        windowPage.clickLinkHere();
        windowPage.swithNewWindow();

        windowPage.checkTransition("New Window");
    }

    @Test(description = "Проверка ShadowDom")
    public void workWithShadowDom(){
        ShadowDomPage shadowDomPage = new ShadowDomPage(driver);

        shadowDomPage.joinDrawingaAppRoot();
        shadowDomPage.joinWelcomeDialogRoot();
        shadowDomPage.clickStartedButton();
        shadowDomPage.swithInitialWindow();
        shadowDomPage.joinDrawingCanvasRoot();
        shadowDomPage.drawSquare();
    }
}

