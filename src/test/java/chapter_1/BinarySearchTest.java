package chapter_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.roklimovich.chapter_1.BinarySearch;

public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 4;
        int expectedIndex = 3;
        int foundIndex = BinarySearch.binarySearch(array, key);

        Assertions.assertEquals(expectedIndex, foundIndex);
        Assertions.assertTrue(foundIndex != 10);
    }

    @Test
    public void binarySearchMiddleTest() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 3;
        int expectedIndex = 2;
        int foundIndex = BinarySearch.binarySearch(array, key);

        Assertions.assertEquals(expectedIndex, foundIndex);
    }


    @Test
    public void binarySearchAtBeginTest() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 1;
        int expectedIndex = 0;
        int foundIndex = BinarySearch.binarySearch(array, key);

        Assertions.assertEquals(expectedIndex, foundIndex);
    }

    @Test
    public void binarySearchAtEndTest() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 6;
        int expectedIndex = 5;
        int foundIndex = BinarySearch.binarySearch(array, key);

        Assertions.assertEquals(expectedIndex, foundIndex);
    }


    @Test
    public void binarySearchNotFoundTest() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 10;
        int expectedIndex = -1;
        int foundIndex = BinarySearch.binarySearch(array, key);

        Assertions.assertEquals(expectedIndex, foundIndex);
    }
}
