
public class SumOfAllFactors {

    public static void factor(int n) {
        System.out.println("Factors of " + n);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of all factors = " + sum);
    }

    public static void main(String[] args) {
        factor(12);
    }
}
