
public class primenuminarray {

    public static void main(String[] args) {
        int[] a = {8, 5, 49, 9, 3, 2};
        boolean b = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 1) {
                b = false;
            } else {
                for (int j = 2; j < a[i]; j++) {
                    if (a[i] % j == 0) {
                        b = false;
                        break;
                    }
                }
            }
            if (b) {
                System.out.println(a[i] + " Number is prime");
            } else {
                System.out.println(a[i] + " Number is not prime");
            }
        }
    }
}
