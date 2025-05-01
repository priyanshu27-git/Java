public class PrintPrimeNumber {
        public static void printprime(int n) { 
                Boolean b = true;
                for (int i = 2; i < n; i++) {
                    if(n % i == 0){
                        b = false;
                    }
                }
                if(b){
                    System.out.println( n +" is Prime");
                }
            }
        public static void main(String[] args){
            for (int i = 2; i < 100; i++) {
                printprime(i);
            }
        }
    }