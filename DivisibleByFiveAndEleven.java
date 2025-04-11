import java.util.Scanner;
public class DivisibleByFiveAndEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 5 == 0) 
        {
            System.out.println("Number is divisible by 5");
        } else if (n % 11 == 0)
         {
            System.out.println("Number is divisible by 11");
        } 
        else 
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}
