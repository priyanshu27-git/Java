
public class checkpalindromenumber {

    public static void palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int digits = temp % 10;
            rev = rev * 10 + digits;
            temp /= 10;
        }
        System.out.println(rev);
        if (rev != n) {
            System.out.println(n + " is not palindrome ");
        } else {
            System.out.println(n + " is Palindrome ");
        }
    }

    public static void main(String[] args) {
        palindrome(-121);
    }
}
