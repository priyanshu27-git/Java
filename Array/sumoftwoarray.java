
//import java.util.Scanner;

public class sumoftwoarray {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};
        int sum =0;

        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i] + arr2[i];
        }
        System.out.println(sum);
    }
}
