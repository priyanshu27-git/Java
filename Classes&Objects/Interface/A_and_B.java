interface A{
    void display();
}
interface B{
    void display();
}
class Demo implements A,B{
    public void display(){
        System.out.println("Andhaaa Paisaa");
    }
}
public class A_and_B {
    public static void main(String[] args) {
     Demo obj = new Demo();
    obj.display();   
    }
}
