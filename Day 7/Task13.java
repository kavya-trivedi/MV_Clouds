// Write a program to create a StringBuffer and Clear the StringBuffer using different methods of that.

public class Task13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(3));
        System.out.println(sb.delete(0, 2));
        System.out.println(sb.deleteCharAt(1));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 2, ""));
        System.out.println(sb.delete(0, sb.length()));
    }
}
