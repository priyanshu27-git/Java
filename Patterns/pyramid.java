
import java.util.Scanner;

class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            for (int j = 0; j < n-i-1 ;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*(i+1) ;j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i-1 ;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
