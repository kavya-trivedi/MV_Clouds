// Swastik

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions (odd): ");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (((i == (n+1)/2)) || ((j == (n+1)/2)) || (i == 1) && (j >= (n+1)/2) || ((j == 1) && (i <= (n+1)/2)) || ((j == n) && (i >= (n+2)/2)) || ((i == n) && (j <= (n+2)/2))) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Enter an odd number!");
        }
    }
}
