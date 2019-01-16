
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int counter = 0;
        int even = 0;
        int odd = 0;

        int result = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            while (number != -1) {
                result += number;
                counter++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                break;
            }
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + result);
                System.out.println("How many number: " + counter);
                System.out.println("Average: " + ((double)result / counter));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
        }

    }
}
