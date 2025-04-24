public class compareequaltwoarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 7, 9, 5};
        boolean equal = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1.length != arr2.length) {
                equal = false;
                break;
            }
            else if(arr1[i] != arr2[i]){
                equal = false;
                break;
            }
        }
        if(equal){
        System.out.println("Elements in Array are same");
        }
    else{
        System.out.println("Elements in Arrays are not same");
    }
}
}
