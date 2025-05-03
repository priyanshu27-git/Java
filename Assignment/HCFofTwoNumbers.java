public class HCFofTwoNumbers {
    public static void GCD(int a,int b) {
        //HCF of two numbers
        while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        GCD(8, 12);
    }
}
