public class Countdigits {
    public static void countdigits(int n) {
        int count = 0;
        int temp = n;
        while(n > 0){
        int digits = n % 10;
        count++;
        n /= 10;
    }        
    System.out.println(count + " digits in " +temp );
    }
    public static void main(String[] args) {
        countdigits(1234);
    }
}
