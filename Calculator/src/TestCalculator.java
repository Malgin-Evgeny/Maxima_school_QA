import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestCalculator{

    private final Calculator calculator = new Calculator();

    @Test
    void addTest() {
        assertEquals(2, calculator.add(1, 1));
    }
    @Test
    void addNegTest(){
        assertEquals(-8, calculator.add(-5, -3));
    }
    @Test
    void subTest() {
        assertEquals(0, calculator.sub(1, 1));
    }
    @Test
    void subNegTest() {
        assertEquals(-2, calculator.sub(-3, -1));
    }

    @Test
    void mulTest() {
        assertEquals(20, calculator.mul(4, 5));
    }
    @Test
    void mulNegTest() {
        assertEquals(-20, calculator.mul(-4, 5));
    }

    @Test
    void divTest() {
        // TODO: Add reading input data for test from file
        assertEquals(2, calculator.div(10, 5));
    }
    @Test
    void divNegTest() {
        // TODO: Add reading input data for test from file
        assertEquals(-2, calculator.div(-10, 5));
    }

    @Test
    void powTest() {
        // TODO: Add reading input data for test from file
        assertEquals(9, calculator.pow(3, 2));
    }
    @Test
    void NegpowTest() {
        // TODO: Add reading input data for test from file
        assertEquals(4, calculator.pow(-2, 2));
    }
    @Test
    void powNegTest() {
        // TODO: Add reading input data for test from file
        assertEquals(-8, calculator.pow(-2, 3));
    }

    @Test
    void sqrtTest() {
        // TODO: Add reading input data for test from file
        //assertEquals(2, calculator.sqrt(4));
    }

}
