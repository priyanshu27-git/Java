
public class primenuminarray {

    public static void main(String[] args) {
        int[] a = {3, 4, 34, 32, 23, 12};
        //boolean b = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    System.out.println(a[i] + " is not prime");
                    break;
                } else {
                    System.out.println(a[i] + " is prime ");
                    break;
                }
            }
        }
    }
}
