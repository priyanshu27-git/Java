public class sumofdigits {
    void sum(){
        int a = 123,sum=0;
        while(a > 0){
            int digit = a % 10;
            sum = sum + digit;
            a /= 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumofdigits obj = new sumofdigits();
        obj.sum();
    }
}
