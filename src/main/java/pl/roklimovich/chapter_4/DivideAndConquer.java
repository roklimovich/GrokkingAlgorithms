package pl.roklimovich.chapter_4;

import java.util.Arrays;

public class DivideAndConquer {
    public static void main(String[] args) {
        int[] array = {1, 2, 10, 4};

        System.out.println(sum(array));
        System.out.println(calculateNumOfElements(array));
        System.out.println(findTheHighestVal(array));
        System.out.println(Arrays.toString(quickSort(array)));
        System.out.println(" ");

        int[] testArray = {2, 3, 7, 8, 10};
        System.out.println(Arrays.toString(testArray));
        multiplicationTable(testArray);
    }

    public static int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        }
        int[] result = new int[array.length - 1];

        System.arraycopy(array, 1, result, 0, array.length - 1);

        return array[0] + sum(result);
    }

    public static int calculateNumOfElements(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return 1;
        }

        int[] result = new int[array.length - 1];
        System.arraycopy(array, 1, result, 0, array.length - 1);

        return 1 + calculateNumOfElements(result);
    }

    public static int findTheHighestVal(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        }

        int[] result = new int[array.length - 1];
        System.arraycopy(array, 1, result, 0, array.length - 1);

        int highest = findTheHighestVal(result);

        return Math.max(array[0], highest);
    }

    public static int[] quickSort(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return array;
        }

        int pivot = array[0];
        int counterLeft = 0;
        int counterRight = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < pivot) {
                counterLeft++;
            } else {
                counterRight++;
            }
        }

        int[] arrayLeft = new int[counterLeft];
        int[] arrayRight = new int[counterRight];
        int indexLeft = 0;
        int indexRight = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < pivot) {
                arrayLeft[indexLeft] = array[i];
                indexLeft++;
            } else {
                arrayRight[indexRight] = array[i];
                indexRight++;
            }
        }

        int[] sortedLeft = quickSort(arrayLeft);
        int[] sortedRight = quickSort(arrayRight);
        int[] result = new int[sortedLeft.length + 1 + sortedRight.length];

        System.arraycopy(sortedLeft, 0, result, 0, sortedLeft.length);
        result[sortedLeft.length] = pivot;
        System.arraycopy(sortedRight, 0, result, sortedLeft.length + 1, sortedRight.length);

        return result;
    }

    // write multiplication table for array [2, 3, 7, 8, 10]. We take first element and multiply on each other.
    public static void multiplicationTable(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                int result = array[i] * array[k];
                System.out.println(array[i] + " * " + array[k] + " = " + result);
            }
            System.out.println(" ");
        }
    }
}
