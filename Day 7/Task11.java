// Reverse Decimal Number.
// Ex. Input : 123.45
// Ouput : 543.21
import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String input = sc.next();
        int pointer = input.indexOf(".");
        String[] parts = input.split("\\.");

        String reversedIntegerPart = new StringBuffer(parts[0]).reverse().toString();
        System.out.println(reversedIntegerPart);
        String reversedFractionPart = new StringBuffer(parts[1]).reverse().toString();
        System.out.println(reversedFractionPart);

        StringBuffer reversedDecimal = new StringBuffer();
        reversedDecimal.append(reversedFractionPart);
        reversedDecimal.append(reversedIntegerPart);
        reversedDecimal.insert(pointer, ".");

        System.out.println(reversedDecimal);
    }
}
