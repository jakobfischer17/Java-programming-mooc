
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i = 1;
        String reversed = "";
        while (i < text.length()) {
          //  if (i == 0) {reversed = reversed + text.charAt(text.length() - i -1);}
            reversed = reversed + text.charAt(text.length() - i);
            i++;
        }
        return reversed + text.charAt(0);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
