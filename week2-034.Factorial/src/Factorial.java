
import java.util.Scanner;
 
public class Factorial {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        int result = 1;
        while (i <= number) {
            if (!(number == 0)) {
                result *= i;
                i++;
            } else {
                result = 1;
            }
        }
        System.out.println(result);
    }
}
 