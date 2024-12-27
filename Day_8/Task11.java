// Star and numbers mix diamond

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int n = sc.nextInt();
        for (int i = 1, p = 0; i <= n; i++, p++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                if (j!=i) {
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }
        for (int i = 2, p = n-2; i <= n; i++, p--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
                if (j!=n) {
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }
    }
}
