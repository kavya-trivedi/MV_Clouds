// Write a program to find the Second biggest integer value in the given list of values.[98,32,72,94,75,73,92,36,28,34]


import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        // Take user input for the list of integers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        List<Integer> values = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            values.add(scanner.nextInt());
        }

        System.out.println("Original List: " + values);

        // Find the second biggest value
        if (values.size() < 2) {
            System.out.println("List must contain at least two elements to find the second biggest value.");
            return;
        }

        // Remove duplicates and sort the list
        TreeSet<Integer> sortedValues = new TreeSet<>(values);
        if (sortedValues.size() < 2) {
            System.out.println("Not enough distinct values to find the second biggest value.");
            return;
        }

        // Get the second biggest value
        sortedValues.pollLast(); // Remove the largest value
        int secondBiggest = sortedValues.last();

        System.out.println("Second biggest value: " + secondBiggest);
    }
}
