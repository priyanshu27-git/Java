
class CheckPerfectNumber {

    public static void perfectNumber(int n) {
        //If we sum all Perfect divisors of a number (except the number itself) and we get same number then the number is Perfect.
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        if (sum == n) {
            System.out.println(n + " is Perfect number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }

    }

    public static void main(String[] args) {
        perfectNumber(28);
    }
}
