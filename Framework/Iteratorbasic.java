
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorbasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Ashu");
        list.add("Aksh");
        list.add("Ananya");
        list.add("Akshu");
        list.add("Priyanshu");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String data = it.next();
            if(data.startsWith("R")){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
