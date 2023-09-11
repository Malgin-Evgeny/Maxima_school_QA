package cucumber.glue;

import Calculator.Calculator;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

public class CalculatorStep {
public Calculator calculator;

    @Когда("взяли калькулятор")
    public void takeCalculator(){
        calculator = new Calculator();
    }

    @И("сложили число x и число y")
    public void sum(double a, double b){
        calculator.add(a, b);
    }
}
