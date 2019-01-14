
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int first;
        first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last;
        last = Integer.parseInt(reader.nextLine());
        int i;
        i = -1000;
        while ((i <= last)) {
           if (i >= first) {System.out.println(i);}
            i++;
        }

    }
}
