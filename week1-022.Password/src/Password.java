
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.println("Type the password: ");
            String keyword = reader.nextLine();
            if (keyword.equals("carrot")) {
                System.out.println("Right!" + "\n" + "\n" + "The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
