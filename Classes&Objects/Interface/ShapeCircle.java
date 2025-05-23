interface Shape{
    void area();
}
class Circle implements Shape{
    public void area(){
        int r =5;
        System.out.println("Area = "+3.14*r*r);
    }
}

public class ShapeCircle {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.area();
    }
}
