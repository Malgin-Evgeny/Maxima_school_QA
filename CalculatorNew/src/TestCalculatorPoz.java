import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalculatorPoz {

    private final Calculator calculator = new Calculator();

    @Test ()
    void addTest() {
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void subTest() {
        Assertions.assertEquals(0, calculator.sub(1, 1));
    }

    @Test
    void mulTest() {
        Assertions.assertEquals(20, calculator.mul(4, 5));
    }

    @Test
    void divTest() {
        Assertions.assertEquals(2, calculator.div(10, 5));
    }

    @Test
    void powTest() {
        Assertions.assertEquals(9, calculator.pow(3, 2));
    }



}