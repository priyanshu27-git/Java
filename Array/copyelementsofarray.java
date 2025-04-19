public class copyelementsofarray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];//copying elements of arr1 into arr2
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");//printing elements of arr2
        }
    }
}
