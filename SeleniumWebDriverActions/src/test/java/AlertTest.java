import org.testng.annotations.Test;

public class AlertTest extends BeforeAndAfter{
    AlertPage alertPage = new AlertPage(driver);

    @Test(description = "Тест на закрытие по кнопке")
    public void openAlert() {
        alertPage.clickButtonAllert();

        alertPage.checkResultButtonAllert("You successfully clicked an alert");
    }

    @Test(description = "Тест на закрытие по кнопке ДА")
    public void openConfirmYes() {
        alertPage.clickConfirmButton();

        alertPage.checkResultConfirmButton("You clicked: Ok");
    }

    @Test(description = "Тест на закрытие по кнопке Нет")
    public void openConfirmDismiss() {
        alertPage.clickConfirmButtonNo();

        alertPage.checkResultConfirmButtonNo("You clicked: Cancel");
    }

    @Test(description = "Тест на закрытие с вводом текста")
    public void openPrompt() {
        alertPage.clickPromptButton();

        alertPage.checkResultPromptButton("You entered: I am Groot");
    }
}
