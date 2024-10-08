package pl.roklimovich.chapter_2;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10, 8, 0, 6};
        System.out.println(findSmallest(array));
        selectionSort(array);
    }

    public static int findSmallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void selectionSort(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;
            for (int k = i + 1; k < array.length; k++) {
                if (array[k] < array[smallestIndex]) {
                    smallestIndex = k;
                }
            }

            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
            System.out.println(counter + " " + Arrays.toString(array));
            counter++;
        }
    }
}
