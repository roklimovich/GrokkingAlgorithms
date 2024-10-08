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
}
