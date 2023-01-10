import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestCalculator {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"2, 1, 1",
            "4, 3, 1",
            "50, 29, 21"})
    void addTest(double result, double a, double b) {
        Assertions.assertEquals(result, calculator.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 1",
            "1, -2, -3",
            "-1, 70, 71"})
    void subTest(double result, double a, double b) {
        Assertions.assertEquals(result, calculator.sub(a, b));
    }

    @ParameterizedTest
    @CsvSource({"10, 2, 5",
            "-9, 3, -3",
            "0, 10, 0"})
    void mulTest(double result, double a, double b) {
        Assertions.assertEquals(result, calculator.mul(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2.5, 5, 2",
            "6, 18, 3",
            "-2, -10, 5"})
    void divTest(double result, double a, double b) {
        Assertions.assertEquals(result, calculator.div(a, b));
    }

    @ParameterizedTest(name = "Деление на 0")
    @CsvSource({"5,0"})
    void divNegTest(double a, double b) {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.div(a, b);});
        Assertions.assertEquals("Делить на 0 нельзя ", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({"144, 12, 2",
            "8, 2, 3",
            "-64, -4, 3"})
    void powTest(double result, double a, long pow) {
        Assertions.assertEquals(result, calculator.pow(a, pow));
    }
}