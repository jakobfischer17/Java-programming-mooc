
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        number = Integer.parseInt(reader.nextLine());
        int i = 0;
        int result = 0;
        while (i <= number) {
        result += i;
        i++;
        }
        System.out.println(result);
    }
}
