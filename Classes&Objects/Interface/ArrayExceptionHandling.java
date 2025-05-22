public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        try {
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Array out of Bounds");
        }
        System.out.println("khatam");
    }
}
