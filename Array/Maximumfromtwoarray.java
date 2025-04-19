public class Maximumfromtwoarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 6};
        int[] arr2 = {5, 8, 7};
        int max = 1;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > max ){
                max = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > max ){
                max = arr2[i];
            }
        }
        System.out.println("Maximum form both array is " + max);
    }
}
