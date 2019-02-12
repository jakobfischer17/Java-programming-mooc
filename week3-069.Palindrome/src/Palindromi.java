 
import java.util.Scanner;
 
public class Palindromi {
 
    public static String reverse(String text) {
        int i = 1;
        String reversed = "";
        while (i < text.length()) {
            reversed = reversed + text.charAt(text.length() - i);
            i++;
        }
        return reversed + text.charAt(0);
    }
 
    public static boolean palindrome(String text) {
        if (text.length() < 1) {return true;}
        if (reverse(text).equals(text)) {
            return true;
        } else {
            return false;
        }
    }
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
 
        }
 
    }
}