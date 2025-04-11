import java.util.*;
public class rightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n=");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
