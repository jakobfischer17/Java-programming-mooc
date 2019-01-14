
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Enter today's temperature: ");
            double temperature = Double.parseDouble(reader.nextLine());
            if ((temperature < -30) || (temperature > 40)) {
                System.out.println("Enter a valid temperature please.");
            } else {
                Graph.addNumber(temperature);
            }
        }
        // Graph is used as follows:

        // Remove or comment out these lines above before trying to run the tests.
    }
}
