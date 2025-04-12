
import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n % 3 == 0){
            System.out.println(n + " is multiple of 3");
        }
        else{
        System.out.println(n + " is not a multiple of 3");
        }
    }
}
