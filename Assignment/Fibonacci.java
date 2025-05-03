public class Fibonacci {
    public static void fibonacci(int n) {
        int a , b = 1, c = 0;
        for (int i = 0; c <= n; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static void main(String[] args) {
        fibonacci(25);
    }
}
