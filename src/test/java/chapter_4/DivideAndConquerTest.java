package chapter_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.roklimovich.chapter_4.DivideAndConquer;

import java.util.Arrays;

public class DivideAndConquerTest {
    private final int[] ARRAY = {10, 20, 50, 0, 1, 2, 3, 4};

    @Test
    public void quickSortTest() {
        int[] expectedResult = {0, 1, 2, 3, 4, 10, 20, 50};
        int notExpectedResultLength = expectedResult.length - 1;
        int[] result = DivideAndConquer.quickSort(ARRAY);
        String expectedResultToString = Arrays.toString(expectedResult);
        String resultToString = Arrays.toString(result);

        Assertions.assertEquals(expectedResultToString, resultToString);
        Assertions.assertTrue(notExpectedResultLength != result.length);
    }

    @Test
    public void sumTest() {
        int expectedResult = 90;
        int result = DivideAndConquer.sum(ARRAY);

        Assertions.assertEquals(expectedResult, result);
        Assertions.assertTrue((expectedResult - 1) != result);
    }

    @Test
    public void calculateNumOfElemTest() {
        int expectedResult = 8;
        int result = DivideAndConquer.calculateNumOfElements(ARRAY);

        Assertions.assertEquals(expectedResult, result);
        Assertions.assertTrue((expectedResult + 1) != result);
    }

    @Test
    public void findTheHighestValueTest() {
        int expectedResult = 50;
        int result = DivideAndConquer.findTheHighestVal(ARRAY);

        Assertions.assertEquals(expectedResult, result);
    }
}
