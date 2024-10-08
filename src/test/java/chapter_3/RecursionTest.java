package chapter_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.roklimovich.chapter_3.Recursion;

public class RecursionTest {
    @Test
    public void findFactorialTest() {
        int n = 10;
        int result = Recursion.findFactorial(n);
        int expectedValue = 3628800;

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findSumOfNumbers() {
        int n = 5;
        int result = Recursion.sumOfNumbers(n);
        int expectedValue = 15;

        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findFibNumber() {
        int n = 19;
        int result = Recursion.calculateFibNum(n);
        int unExpectedValue = 4183;
        int expectedValue = 4181;

        Assertions.assertNotEquals(unExpectedValue, result);
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void checkIsPalindrome() {
        String word = "level";
        boolean result = Recursion.isPalindrome(word);
        boolean expectedResult = true;
        String word1 = "java";
        boolean result1 = Recursion.isPalindrome(word1);

        Assertions.assertEquals(expectedResult, result);
        Assertions.assertNotEquals(expectedResult, result1);
    }

    @Test
    public void findRecursivelyLength() {
        String word = "level";
        int result = Recursion.recursiveLength(word);
        int expectedResult = 5;

        Assertions.assertEquals(expectedResult, result);
    }
}
