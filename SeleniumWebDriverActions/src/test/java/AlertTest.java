import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BeforeAndAfter {
    AlertPage alertPage = new AlertPage(driver);

    @Test(description = "Тест на закрытие по кнопке")
    public void openAlert() {
        String expected = "You successfully clicked an alert";
        alertPage.clickButtonAllert();
        Assert.assertEquals(alertPage.getAlertMessage(), expected);
    }

    @Test(description = "Тест на закрытие по кнопке ДА")
    public void openConfirmYes() {
        String expected = "You clicked: Ok";
        alertPage.clickConfirmButton();
        Assert.assertEquals(alertPage.getAlertMessage(), expected);
    }

    @Test(description = "Тест на закрытие по кнопке Нет")
    public void openConfirmDismiss() {
        String expected = "You clicked: Cancel";
        alertPage.clickConfirmButtonNo();
        Assert.assertEquals(alertPage.getAlertMessage(), expected);
    }

    @Test(description = "Тест на закрытие с вводом текста")
    public void openPrompt() {
        String message = "I am Groot";
        String expected = "You entered: I am Groot";
        alertPage.clickPromptButton();
        alertPage.sendKeys(message);
        Assert.assertEquals(alertPage.getAlertMessage(), expected);
    }
}
