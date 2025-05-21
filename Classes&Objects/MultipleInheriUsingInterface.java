interface Client1{
    void show();

}
interface Client2{
    void show();
    void print();
}
 class Multiple implements Client1,Client2{
        public void show(){
        System.out.println("we are studying interface by");
        }
        public void print(){
            System.out.println("Curiouss sir");
        }
}
public class MultipleInheriUsingInterface{
    public static void main(String[] args) {
        Multiple obj = new Multiple();
        obj.show();
        obj.print();
    }
}
