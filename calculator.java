
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        int a, b, ans = 0;
        char c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.next().charAt(0);
        switch(c) {
            case '+': {
                ans = a + b;
                break;
            }
            case '-': {
                ans = a - b;
                break;
            }
            case '*': {
                ans = a * b;
                break;
            }
            case '/': {
                if (b != 0) {
                    ans = a / b; 
                }else {
                    System.out.println("INF");
                }
                break;
            }
            case '%': {
                if (b != 0) {
                    ans = a % b; 
                }else {
                    System.out.println("INF");
                }
                break;
            }
            default:
                System.out.println("NA");
                break;
        }
        System.out.println(ans);
    }
}
