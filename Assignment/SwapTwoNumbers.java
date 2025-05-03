public class SwapTwoNumbers {
    public static void Swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " +b);
    }
    public static void main(String[] args) {
        Swap(10, 20);
    }
}
