import Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalculatorNeg {

    private final Calculator calculator = new Calculator();

    @Test
    void divByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.div(15, 0);
        });
    }
}

