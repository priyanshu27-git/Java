import java.util.*;
public class rightTriangletwo {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n=");
        int n = scanner.nextInt();
        int space=n-1;
        for(int i=0;i<n;i++){
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
            space--;
        }
    }
}
