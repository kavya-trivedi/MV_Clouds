// Create a program to perform encryption and decryption of the given message.
import java.util.*;

public class Task14 {
    String encrypt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message to encrypt: ");
        String message = sc.nextLine();
        
        char[] arr = message.toCharArray();
        String enryptedMessage = "";

        for (int i = 0; i < arr.length; i++) {
            int ascii = arr[i];
            ascii += 2;
            enryptedMessage += (char)ascii;
        }
        return enryptedMessage;
    }
    String decrypt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message to decrypt: ");
        String message = sc.nextLine();
        
        char[] arr = message.toCharArray();

        String deryptedMessage = "";

        for (int i = 0; i < arr.length; i++) {
            int ascii = arr[i];
            ascii -= 2;
            deryptedMessage += (char)ascii;
        }
        return deryptedMessage;
    }
    public static void main(String[] args) {
        Task14 t14 = new Task14();
        System.out.println(t14.encrypt());
        System.out.println(t14.decrypt());
    }
}
