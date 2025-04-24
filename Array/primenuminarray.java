
public class primenuminarray {

    public static void main(String[] args) {
        int[] a = {8, 5, 49, 1, 3, 2};
        for (int i = 0; i < a.length; i++) {
            boolean b = true;
            int num = a[i];
            if (num <= 1) {
                b = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        b = false;
                        break;
                    }
                }
            }
            if (b) {
                System.out.println(num+ " Number is prime");
            } else {
                System.out.println(num + " Number is not prime");
            }
        }
    }
}
