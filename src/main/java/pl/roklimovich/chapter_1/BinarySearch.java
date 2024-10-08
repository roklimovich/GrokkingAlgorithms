package pl.roklimovich.chapter_1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = 6;
        System.out.println(binarySearch(array, key));

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int key1 = 10;
        System.out.println(binarySearch(array1, key1));
    }


    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // to prevent integer overflow when calculating the midpoint in a binary search
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
