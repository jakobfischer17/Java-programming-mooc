import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= number) {
        if (number == 0) {System.out.println(1);}
        else {
            number = i * (i-1);
        i++;
        }
        System.out.println(number);}
    }
}
