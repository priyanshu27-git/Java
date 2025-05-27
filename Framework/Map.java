
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id1", 12);
        map.put("id2", 2);
        map.put("id3", 3);
        System.out.println(map);
        System.out.println(map.get("id1"));
        System.out.println(map.containsKey("id2"));
        System.out.println(map.hashCode());
        System.out.println(map.remove("id2"));
        System.out.println(map.get("id1").hashCode());
        System.out.println(map);
        
    }
}
