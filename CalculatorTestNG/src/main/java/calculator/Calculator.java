package calculator;

public class Calculator {

    public Calculator() {
    }

    private double result;
    public double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;
        return result;
    }

    public double mul(double a, double b) {
        double result = a * b;
        return result;
    }

    public double div(double a, double b) {
        double result = a/b;
        if (b == 0) {
            throw new ArithmeticException("Divisor cannot div by zero");
        }
        return result;
    }

    public double pow(double a, double pow) {
        double result = Math.pow(a, pow);
        return result;
    }
}


