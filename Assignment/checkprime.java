public class checkprime {
    public static void Checkprime(int n) { 
        Boolean b = true;
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                b = false;
            }
        }
        if(b){
            System.out.println( n +" is Prime");
        }
        else{
            System.out.println( n +" is not Prime");
        }
    }
    public static void main(String[] args) {
        Checkprime(2);
    }
}
