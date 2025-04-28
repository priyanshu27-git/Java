
public class Bubblesort {

    public static void Bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {22, 3, 5, 2, 2, 7, 1, 6};
        Bubblesort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
