import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculatorNeg {

        private final Calculator calculator = new Calculator();

        @Test
        void addNegTest() {
            Assertions.assertEquals(-8, calculator.add(-5, -3));
        }
        @Test
        void subNegTest() {
            Assertions.assertEquals(-2, calculator.sub(-3, -1));
        }
        @Test
        void mulNegTest() {
            Assertions.assertEquals(-20, calculator.mul(-4, 5));
        }
        @Test
        void divNegTest() {
            Assertions.assertEquals(-2, calculator.div(-10, 5));
        }
        @Test
        void NegpowTest() {
            Assertions.assertEquals(4, calculator.pow(-2, 2));
        }
        @Test
        void powNegTest() {
            Assertions.assertEquals(-8, calculator.pow(-2, 3));
        }


    }

