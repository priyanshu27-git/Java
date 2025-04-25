public class printmaxdigit {
    int maxdigit(int a, int b){
        int sum = a + b;
        System.out.println("sum = "+sum);
        int max=1;
        while(sum > 0){
            int digit = sum % 10;
            int prev = digit;
            sum /= 10;
            if(digit > max){
                max = digit;
            }
        }
    return max;
    }
    public static void main(String[] args) {
        printmaxdigit obj =  new printmaxdigit();
        System.out.println(obj.maxdigit(121,232));
    }
}
