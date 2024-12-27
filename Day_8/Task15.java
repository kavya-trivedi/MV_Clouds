// Write a program to check whether the input number is ArmStrong number or not.

import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
