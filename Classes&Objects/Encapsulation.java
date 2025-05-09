public class Encapsulation {
    int a;
    public void setrupess(int a){
        this.a = a;
    }
    public int getrupees(){
        return a;
    }
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setrupess(150);
        System.out.println(obj.getrupees());
    }
}
