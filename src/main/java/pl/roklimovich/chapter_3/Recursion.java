package pl.roklimovich.chapter_3;

public class Recursion {
    public static void main(String[] args) {
        int factorialOfValue = 10;
        System.out.println(findFactorial(factorialOfValue));

        int n = 5;
        System.out.println(sumOfNumbers(n));
        int n1 = 10;
        System.out.println(sumOfNumbers(n1));

        int n2 = 19;
        System.out.println(calculateFibNum(n2));

        String word = "level";
        System.out.println(isPalindrome(word));

        String word1 = "java";
        System.out.println(isPalindrome(word1));

        System.out.println(word + " " + " length: " + recursiveLength(word));
        System.out.println(word1 + " " + " length: " + recursiveLength(word1));
    }

    // Write a Java recursive method to calculate the factorial of a given positive integer.
    public static int findFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * findFactorial(n - 1);
    }

    // Write a Java recursive method to calculate the sum of all numbers from 1 to n.
    public static int sumOfNumbers(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumOfNumbers(n - 1);
    }

    // Write a Java recursive method to calculate the nth Fibonacci number.
    public static int calculateFibNum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return calculateFibNum(n - 1) + calculateFibNum(n - 2);
    }

    // Write a Java recursive method to check if a given string is a palindrome.
    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if (firstChar != lastChar) {
            return false;
        }

        String newWord = word.substring(1, word.length() - 1);

        return isPalindrome(newWord);
    }

    // Write a Java recursive method to find the length of a given string.
    public static int recursiveLength(String word) {
        if (word.isEmpty()) {
            return 0;
        }

        String newWord = word.substring(1);

        return 1 + recursiveLength(newWord);
    }
}
