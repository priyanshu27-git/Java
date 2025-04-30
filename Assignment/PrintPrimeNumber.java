public class PrintPrimeNumber {
        public static void printprime() { 
             Boolean b = true;
            for (int i = 2; i < 10; i++) {
                int temp = i;
                for(int j = 2; j < i; j++){
                    if(temp % j == 0){
                        b = false;
                    }
                    else if(temp % j != 0 && j == temp - 1){
                        System.out.println(temp);
                    }
                }   
            }  
        }
        public static void main(String[] args) {
            printprime();
        }
    }