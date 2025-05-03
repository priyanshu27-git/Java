public class SwapfirstandlastDigitsOfNumber {
    public static void SwapDigits(int n) {
        int temp1 = n;
        int divisor = 1;
        while(temp1 > 10){
            divisor *= 10;
            temp1 /= 10;
        }
        int firstdigit = n / divisor;
        int lastdigit = n % 10;
        int temp2 = n;
        temp2 /= 10;
        int swap = lastdigit * divisor + temp2 + firstdigit;
        System.out.println(swap);
    }
    public static void main(String[] args) {
        SwapDigits(456);
    }
}
