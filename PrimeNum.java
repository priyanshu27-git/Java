
import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
