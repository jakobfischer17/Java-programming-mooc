
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;
        while (i < amount) {
            System.out.print(" ");
            i++;

        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        while (i < size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        int counter = 1;
        while (i < height) {
            printWhitespaces(height - i);
            printStars(counter);
            i++;
            counter = counter + 2;
        }
        printWhitespaces(((counter - 1) / 2) - 1);
        printStars(3);
        printWhitespaces(((counter - 1) / 2) - 1);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        printTriangle(1);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
