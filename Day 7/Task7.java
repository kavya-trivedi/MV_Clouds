// Write a program to swap two numbers without using a third variable.
import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("a = " + a + ", b = " + b);
    }
}
