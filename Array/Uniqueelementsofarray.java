
public class Uniqueelementsofarray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 4};
        System.out.println("Unique elements in array 1");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] != arr2[j]) {
                    if (j == arr2.length - 1) {
                        System.out.println(arr1[i] + " is Unique");
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("Unique elements in array 2");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] != arr1[j]) {
                    if (j == arr1.length - 1) {
                        System.out.println(arr2[i] + " is Unique");
                    }
                } else {
                    break;
                }
            }
        }
    }
}
