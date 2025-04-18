public class Maximumelement {
    public static void main(String[] args) {
        int[] a = {1,28,28,40,5};
        int max = 1;
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("Maximum element = " + max);
    }
}
