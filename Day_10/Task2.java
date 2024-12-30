// W pattern
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 4*n; j++) {
                if ((j > i && j <= n) || (i+j > 2*n+1 && j <= 2*n) || (j < i+(2*n-1) && (j < 3*n && j > 2*n)) || (i+j < 4*n && j > 3*n-1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
