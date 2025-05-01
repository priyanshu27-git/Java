public class HarshadNumber {
    public static void Harshad(int n) {
        int sum =0,temp = n;
        while(temp > 0){
            int digits = temp % 10;
            sum += digits;
            temp /= 10;
        }
        if(n % sum == 0){
            System.out.println(n + " is Harshad Number");
        }else{
            System.out.println(n + " is not Harshad Number");
        }
    }
    public static void main(String[] args) {
        Harshad(171);
    }
}
