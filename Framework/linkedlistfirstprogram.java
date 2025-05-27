
import java.util.LinkedList;

public class linkedlistfirstprogram {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        long start = System.nanoTime();
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.contains(ll.get(2));
        System.out.println(ll);
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
