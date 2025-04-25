public class calculatorusingreturn {
    static int sum(int a,int b){
        return a + b;
    }
    static int sub(int a,int b){
        return a - b;
    }
    static int mul(int a,int b){
        return a * b;
    }
    static int div(int a,int b){
        return a / b;
    }
    public static void main(String[] args) {
        calculatorusingreturn obj = new calculatorusingreturn();
        System.out.println(sum(3,4));
        System.out.println(sub(5,2));
        System.out.println(mul(3,4));
        System.out.println(div(4,2));
    }
}
