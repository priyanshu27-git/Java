public class PrimeNumberInRange {
    public static void primeinrange(int a, int n) { 
       for (int i = a; i < n; i++) {
        Boolean b = true;
        for (int j = 2; j < i; j++) {
            if(i % j == 0){
                b = false;
            }
        }
        if(b){
            System.out.println( i + " is Prime");
        }
       }
    }
    public static void main(String[] args) {
        primeinrange(15, 67);
    }
}
