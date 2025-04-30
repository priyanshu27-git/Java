public class countfactors {

        public static void factor(int n) {
            int count =0;
            System.out.println("Factors of " + n);
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    System.out.println(i);
                }
            }
            System.out.println("There are " +count +" factors of " +n);
        }
    
        public static void main(String[] args) {
            factor(22);
        }
}
