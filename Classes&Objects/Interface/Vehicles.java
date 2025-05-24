interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
}
public class Vehicles{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
    }
}