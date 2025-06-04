class Jhol extends Thread{
    static int balance = 1000;
    int amount;

    public Jhol(int amount) {
        this.amount = amount;
    }
    public void run(){
        if(amount >= balance){
            System.out.println("Gareeb hai aap");
        }
        else{
        balance -= amount;
        System.out.println(amount + " withdraw succefully \nbalance " + balance);
        }
    }
    
}
public class Account{
    public static void main(String[] args) {
        Jhol t1 = new Jhol(800);
        Jhol t2 = new Jhol(500);
        t1.start();
        t2.start();
    }
}