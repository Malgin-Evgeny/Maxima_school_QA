import Calculator.Calculator;
import org.testng.annotations.Test;

public class TestCalculatorNeg {
    private final Calculator calculator = new Calculator();

    @Test(expectedExceptions = ArithmeticException.class)
    public void divByZeroTest() {
        calculator.div(12, 0);
    }
}

