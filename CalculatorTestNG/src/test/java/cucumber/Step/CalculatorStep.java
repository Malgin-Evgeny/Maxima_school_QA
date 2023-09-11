package cucumber.Step;

import calculator.Calculator;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.testng.Assert;

public class CalculatorStep {
public Calculator calculator;
private Double result;

    @Когда("взяли калькулятор")
    public void takeCalculator(){
        calculator = new Calculator();
    }

    @И("сложили число {double} и число {double}")
    public void sum(double a, double b){
        result = calculator.add(a, b);
    }

    @Тогда("должны получить ответ {double}")
    public void checkResult(Double z) {
        Assert.assertEquals(result,z);
    }
}
