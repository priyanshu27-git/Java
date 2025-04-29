public class printProductOfN {
        public static void printProduct(int n){
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            System.out.println(product);
        }
        public static void main(String[] args) {
            printProduct(5);
        }
}
