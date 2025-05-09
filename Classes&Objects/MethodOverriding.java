abstract class Payment{
    abstract void pay();
    void print(){
        System.out.println("Payment Done");
    }
}
class UpiPayment extends Payment{
    void pay(){
        System.out.println("Payment Done by Upi");
    }
    
}
public class MethodOverriding {
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.pay();
        obj.print();
    }
}
