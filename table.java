import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int table=0;
        for(int i=1;i<=10;i++)
        {
            table = n * i;
            System.out.print(table + " ");
        }
    }
}
