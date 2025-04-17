public class commoninarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 4, 6};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.println( arr1[i] + " is common ");
                }
            }
        }
    }
}
