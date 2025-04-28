public class LinearSearch {
    public static void LinearSearch(int a[], int target) {
        int count = 0,i;
        for  (i = 0; i < a.length; i++) {
            if(a[i] == target){
                count = i;
                break;
            }
            else{
                count = 0;
            }
        }
        if(count != 0){
        System.out.println("Element found at " +i);
        }
        else {
            System.out.println("Element not found ");
        }
    }
    public static void main(String[] args) {
        int a[] = {6,3,1,5,2,3};
        LinearSearch(a, 5);
    }
}
