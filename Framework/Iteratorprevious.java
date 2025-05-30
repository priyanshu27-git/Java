import java.util.ArrayList;
import java.util.ListIterator;

public class Iteratorprevious {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ritik");
        list.add("Ashu");
        list.add("Aksh");
        list.add("Ananya");
        list.add("Akshu");
        list.add("Priyanshu");
        System.out.println(list);
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String data = it.next();
            System.out.println(data);
        }
        System.out.println("alg hu mai");
         while(it.hasPrevious()){
            String data = it.previous();
            System.out.println(data);
        }
    }
}
