public class countevenoddarray {
    public static void main(String[] args) {
        int[] a = {1,28,28,40,5};
        int counteven = 0;
        int countodd = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                counteven++;
            }
            else if(a[i] % 2 != 0){
                countodd++;
            }
        }
        System.out.println(counteven + " Even numbers in array ");
        System.out.println(countodd + " Odd numbers in array");
    }
}
