
import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Zero");
        } else if (n % 2 == 0) {
            System.out.println("Even");
        } else if (n % 2 != 0) {
            System.out.println("Odd");
        }
    }
}
