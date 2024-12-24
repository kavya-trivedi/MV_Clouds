// "Find the word according to input.
// Ex. String input: I love Java
// number input : 3
// Ouput : Java "

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String input: ");
        String stringInput = sc.nextLine();
        System.out.print("Number input: ");
        int numberInput = sc.nextInt();

        String[] arr = stringInput.split("\\s+");
        String output = arr[numberInput-1];

        System.out.println("Output: " + output);
    }
}
