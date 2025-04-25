
public class returnsmallestnumber {

    int minimum() {
        int a[] = {4, 3, 7, 2, 8};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        returnsmallestnumber obj = new returnsmallestnumber();
        System.out.println(obj.minimum());

    }
}
