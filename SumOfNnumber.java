import java.util.Scanner;
public class SumOfNnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=0,sum=0;
        while(i<=n)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum= " +sum);
    }
}
