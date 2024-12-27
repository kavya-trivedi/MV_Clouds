// "Write a java program to reverse each word in a given string.
//  (Ex. ""My name is Khan"" => ""Khan is name My"")"


import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        // Take user input for the string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Original String: " + input);

        // Split the string into words
        String[] words = input.split(" ");

        // Reverse the words manually
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        System.out.println("Reversed String: " + reversedString.toString());
    }
}
