import java.util.ArrayList;
import java.util.Scanner;
 
public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
        String name = reader.nextLine();
        words.add(name);
        if (name.isEmpty() ){break;}}
            System.out.println("You typed the following words: ");
            for (String word : words) {System.out.println(word);}
        
    }
}
