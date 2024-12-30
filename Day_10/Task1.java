// Write a Java program to print the pattern given below using only two variables of up to n number of lines and take n as input.
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// Note: Variables used in the loop are also counted as separate variables and will be considered one of the variables; input n will not be considered in the two variables.
// Write a Java program to print the below-given pattern up to n number of rows.
// Note:- Only use 2 for loops

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimentions: ");
        int n = sc.nextInt();
        for (int i = 1, j = 1; i <= n; i++) {
            while (j < i * (i + 1) / 2 + 1) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}