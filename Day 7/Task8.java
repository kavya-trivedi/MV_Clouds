import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter a list of space seperated numbers: ");
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if ((Integer.parseInt(arr[i])) % 2 != 0) {
                list.add(Integer.parseInt(arr[i]));
            }
        }
        System.out.println(list);
    }
}
