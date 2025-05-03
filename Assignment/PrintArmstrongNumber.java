
public class PrintArmstrongNumber {

    public static void Armstrong(int n) {
        int count = 0, temp1 = n;
        while (temp1 > 0) {//finding digits of n
            int digits1 = temp1 % 10;
            count++;
            temp1 /= 10;
        }
        int temp2 = n;
        int ans = 0;
        while (temp2 > 0) {
            int pow = 1;
            int digits2 = temp2 % 10;
            for (int i = 0; i < count; i++) {
                pow *= digits2;
            }
            ans += pow;
            temp2 /= 10;
        }
        if (ans == n) {
            System.out.println(ans + " is Armstrong");
        }
    }

    public static void main(String[] args) {
        int start = 100, end = 500;
        for (int i = start; i <= end; i++) {
            Armstrong(i);
        }

    }
}
