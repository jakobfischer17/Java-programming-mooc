import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {break;}
            list.add(word);
        }
        Collections.reverse(list);
        System.out.println("You typed in the following words: ");
        for (String items : list) {System.out.println(items);}
    }
}