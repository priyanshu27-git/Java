public class LCMofTwoNumber {
    public static void LCM(int a,int b) {
        // GCD of two number
        int b1 = b, a1 = a;
        while (b1 != 0) {
            int temp = b1;
            b1 = a1 % b1;
            a1 = temp;
        }
        System.out.println("GCD of " + a + " and " + b + " = " +a1);
        //LCM Formula
        int LCM = (a * b)/a1;
        System.out.println("LCM of " + a + " and " + b + " = " +LCM);
    }
    public static void main(String[] args) {
        LCM(8, 12);
    }
}
