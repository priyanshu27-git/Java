
// public class primenuminarray {

//     public static void main(String[] args) {
//         int[] a = {8, 5, 49, 9, 3, 2};
//         boolean b = true;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] <= 1) {
//                 b = false;
//             }else{
//             for (int j = 2; j < a[i] / 2; j++) {
//                 if (a[i] % j == 0) {
//                     b = false;
//                     break;
//                 }
//             }
//             }
//             if (b) {
//                 System.out.println( a[i] + " Number is prime");
//             } else {
//                 System.out.println(a[i] + " Number is not prime");
//             }
//         }
//     }
// }
public class primenuminarray {

    public static void main(String[] args) {
        int[] a = {2, 2, 2, 9, 2, 2};

        for (int i = 0; i < a.length; i++) {
            boolean isPrime = true;

            if (a[i] <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                    if (a[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(a[i] + " is prime");
            } else {
                System.out.println(a[i] + " is not prime");
            }
        }
    }
}
