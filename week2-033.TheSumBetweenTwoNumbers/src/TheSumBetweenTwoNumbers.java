
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first;
        first = Integer.parseInt(reader.nextLine());
        int last;
        last = Integer.parseInt(reader.nextLine());
        int i = first;
        int result = 0;
        while (i >= first) {
            if (i <= last) {
                result += i;
            }
            i++;
        }
        System.out.println(result);
    }
}
