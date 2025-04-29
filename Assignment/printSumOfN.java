public class printSumOfN {
    public static void printsum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        printsum(5);
    }
}
