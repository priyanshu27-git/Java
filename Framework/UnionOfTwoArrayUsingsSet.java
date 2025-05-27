
import java.util.HashSet;

public class UnionOfTwoArrayUsingsSet {
    public static void main(String[] args) {
        HashSet<Integer> obj = new HashSet<>();
        //Union of two Array Using HashSet
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {2,3,4,5};
        for (int i = 0; i < arr1.length; i++) {
            obj.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            obj.add(arr2[i]);
        }
        for (int i : obj) {
            System.out.print(i + " ");
        }
    }
}
