// Write a java program to calculate the permutation and combination of a 2 numbers.

import java.util.*;

public class Task13 {

    // Method to calculate factorial
    static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate permutation
    static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    // Method to calculate combination
    static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        // Take user input for n and r
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        System.out.println("Enter the value of r:");
        int r = scanner.nextInt();

        if (n < r || n < 0 || r < 0) {
            System.out.println("Invalid input. Ensure that n >= r and both are non-negative.");
        } else {
            // Calculate and display permutation and combination
            int perm = permutation(n, r);
            int comb = combination(n, r);

            System.out.println("Permutation (P(" + n + ", " + r + ")): " + perm);
            System.out.println("Combination (C(" + n + ", " + r + ")): " + comb);
        }
    }
}
