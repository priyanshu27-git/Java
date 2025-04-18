
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number you want to search = ");
        int n = scanner.nextInt();
        int a[] = {2, 5, 27, 12, 23};
        int count=0,i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
                break;
            }
            else{
                count=0;
            }
        }
        if(count != 0){
            System.out.println("Yupp!! " + n + " found at index " + i);
        }
        else{
            System.out.println("Oops!! " + n + " is not found in Array ");
        }
    }
}
