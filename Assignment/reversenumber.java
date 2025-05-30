public class reversenumber {
    public static void reverse(int n) {
        int rev = 0;
    while(n != 0){
        int digits = n % 10;
        rev = rev * 10 + digits ;
        n /= 10; 
    }
    System.out.println("Reverse number = " +rev);
    }
    public static void main(String[] args) {
        reverse(-123);
    }
}
