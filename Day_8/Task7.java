// 8

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n || j == 1 || j == n) && (i != j) && (i + j != n + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n || j == 1 || j == n) && (i != j) && (i + j != n + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
