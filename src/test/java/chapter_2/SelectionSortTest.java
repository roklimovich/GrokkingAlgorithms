package chapter_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.roklimovich.chapter_2.SelectionSort;

public class SelectionSortTest {
    @Test
    public void selectionSortTest() {
        int[] array = {1, 2, 3, 10, 8, 0, 6, 9, 20, 40, 5, 15};
        int firstElement = 0;
        int lastElement = array.length - 1;
        SelectionSort.selectionSort(array);
        Assertions.assertEquals(0, array[0]);
        Assertions.assertEquals(firstElement, array[0]);
        Assertions.assertNotEquals(lastElement, array[1]);
    }
}
