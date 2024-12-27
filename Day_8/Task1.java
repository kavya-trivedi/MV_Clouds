// Write a program to remove whitespaces from a given String. (Without using any inbuilt functions)  String - "WELCOME TO MV CLOUDS"
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)==' ') || (str.charAt(i) == '\t')) {
                continue;
            }
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}