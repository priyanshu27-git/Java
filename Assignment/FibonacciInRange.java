public class FibonacciInRange {
    public static void Fibonacci(int n) {
        int a = 0, b = 1, c = 5;
        for (int i = 0; c <= n; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static void main(String[] args) {
        Fibonacci(21);
    }
}
