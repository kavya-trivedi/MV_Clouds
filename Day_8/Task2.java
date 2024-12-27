// Write a program to sort the given list of characters in alphabetical order. ()
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Character> charList = Arrays.asList('d', 'a', 'c', 'b', 'e');

        System.out.println("Original List: " + charList);

        Collections.sort(charList);

        System.out.println("Sorted List: " + charList);
    }
}
