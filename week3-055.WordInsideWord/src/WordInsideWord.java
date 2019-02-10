
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String fword = reader.nextLine();
        System.out.println("Type the second word: ");
        String sword = reader.nextLine();
        int index = fword.indexOf(sword);

        if (index == -1) {
            System.out.println("The word '" + sword + "' is not found in the word '" + fword + "'.");
        } else {
            System.out.println("The word '" + fword.substring(index) + "' is found in the word '" + fword + "'."
            );
        }

    }
}
