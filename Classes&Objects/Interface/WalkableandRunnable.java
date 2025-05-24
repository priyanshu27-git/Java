interface Walkable{
    void walk();
}
interface Runnable{
    void run();
}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("Walking");
    }
    public void run(){
        System.out.println("Running");
    }
}
public class WalkableandRunnable{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.walk();
        obj.run();
    }
}