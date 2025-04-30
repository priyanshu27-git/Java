
public class FactorsOfanumber {

    public static void factor(int n) {
        System.out.println("Factors of " + n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        factor(22);
    }
}
