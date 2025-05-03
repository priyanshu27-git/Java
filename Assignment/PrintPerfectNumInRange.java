class PrintPerfectNumInRange{
    public static void perfectNumber(int n){
    int sum = 0;
    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
    if (sum == n) {
        System.out.println(n + " is Perfect number");
    }

}

public static void main(String[] args) {
    int start = 10,end = 500;
    for (int i = start; i <= end; i++) {
        perfectNumber(i);
    }  
}
}