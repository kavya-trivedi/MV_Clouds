// Hollow butterfly

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j==1) || (i==j) || (i==n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = i+1; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if ((j==1) || (i==j) || (i==n)) {
                    if (j!=n) {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if ((i==j) || (j==n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 2; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                if ((i==j) || (j==n)) {
                    if (j==1) {continue;}
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
