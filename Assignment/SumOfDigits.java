public class SumOfDigits {
    public static void sum(int n) {
        int sum = 0;
        while(n > 0){
            int digits = n % 10;
            sum += digits;
            n /= 10;
        }
        System.out.println("Sum = " +sum);
    }
    public static void main(String[] args) {
        sum(1234);
    }
}
