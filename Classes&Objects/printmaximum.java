public class printmaximum {
    void max(int a,int b){
        if(a>b){
            System.out.println( a + " is maximum");
        }
        else {
           System.out.println(b + " is greater");
        }   
    }
    public static void main(String[] args) {
        printmaximum obj = new printmaximum();
        obj.max(12,14);
    }
}
