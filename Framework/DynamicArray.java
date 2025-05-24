import java.util.ArrayList;
import java.util.Collections;
public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Priyanshu");
        a.add("Akshu");
        a.add("Ashu");
        //a.remove(2);
        //System.out.println(a.get(1));
        a.set(2,"ritik");
        Collections.sort(a);
        System.out.println(a);
    }
}
