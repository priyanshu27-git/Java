
public class BinarySearch {

    public static int BinarySearch(int arr[], int left, int right, int key) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return BinarySearch(arr, mid + 1, right, key);
        } else {
            return BinarySearch(arr, left, mid - 1, key);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 7, 12, 55, 67};
        int key = BinarySearch(arr, 0, arr.length - 1, 7);
        if (key == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at " + key);
        }

    }
}
