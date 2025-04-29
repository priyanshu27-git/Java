public class DigitsOfNumber {
    public static void printdigits(int n){
        if(n == 0){
        return;
        }
        int divisor = 1;
        int temp = n;
        while(temp > 10){
        temp = temp / 10;
        divisor *= 10; 
        }
        while(n > 0){
        int digits = n / divisor;
        System.out.println(digits);
        n = n % divisor;
        divisor /= 10;
        }
    }
  public static void main(String[] args) {
      printdigits(7387);
  }
}
//for reverse printing
/*
  digit = n % 10;
  System.out.println(digit);
  n /= 10;   
 */