public class Main {
    public static void main(String[] args) {
        couter(4);

        Factorial factorial = new Factorial();
        System.out.println(factorial.fac(5));
    }

    public static void couter(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        couter(n - 1);
    }
}