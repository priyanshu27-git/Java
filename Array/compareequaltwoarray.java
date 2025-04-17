public class compareequaltwoarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean equal = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]){
                equal = true;
            }
            else{
                equal = false;
            }
        }
        if(equal==true){
        System.out.println("Arrays are same");
        }
    else{
        System.out.println("Arrays are not same");
    }
}
}
