
public class printbetweenrange {

    public static void printevennum(int start, int end) {
        if (start > end) {
            return;
        }
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.println(" " + i);
            }
        }
    }

    public static void main(String[] args) {
        printevennum(20, 30);
    }
}
