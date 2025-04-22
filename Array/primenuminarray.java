
public class primenuminarray {

    public static void main(String[] args) {
        int[] a = {3, 2, 34, 32, 23, 12};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = 2;
            for (int j = 0; j < a[j]; j++) {
                if (a[j] % temp == 0) {
                    count++;
                    temp++;
                    break;
                }
                System.out.println( a[j] + " is not a prime number");
            }
        }
        if (count != 0) {
            System.out.println(n + " is prime number");
        }
    }
}
