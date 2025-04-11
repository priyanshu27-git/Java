
import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) throws Exception {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Zero");
        } else if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        }
    }
}
