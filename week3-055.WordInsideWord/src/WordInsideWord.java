
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String fword = reader.nextLine();
        System.out.println("Type the second word: ");
        String sword = reader.nextLine();
        int index = fword.indexOf(sword); //index value
        System.out.println(index);
        if (index != -1) {
        System.out.println("the word '" + sword + "' is found in the word '" + fword + "'.");}
        else {System.out.println("the word '" + sword + "' is not found in the word '" + fword + "'.");}
        }
    }

