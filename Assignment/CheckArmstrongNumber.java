
public class CheckArmstrongNumber {

    public static void Armstrong(int n) {
        int count = 0, temp1 = n;
        while (temp1 > 0) {//finding digits of n
            int digits1 = temp1 % 10;
            count++;
            temp1 /= 10;
        }
        //System.out.println(count);
        //Finding Armstrong number
        //int divisors = 1;
        int temp2 = n;
        int ans = 0;
        // while (temp2 > 10) {
        //     temp2 = temp2 / 10;
        //     divisors *= 10;// making divisors same digit as of n
        // }
        // int temp = n;
        // while (temp > 0) {
        //     int pow = 1;
        //     int digits2 = temp / divisors;
        //     for (int i = 0; i < count; i++) {
        //         pow = pow * digits2;
        //     }
        //     temp = temp % divisors;
        //     divisors /= 10;
        //     ans = ans + pow;
        // }
        while(temp2 > 0){
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
        } else {
            System.out.println(ans + " is not Armstrong");
        }
    }
    public static void main(String[] args) {
        Armstrong(153);
}
}
