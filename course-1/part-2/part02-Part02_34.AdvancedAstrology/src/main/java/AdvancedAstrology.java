
public class AdvancedAstrology {

    public static void print(int number, String str) {
        while (number >= 1) {
            System.out.print(str);
            number--;
        }
    }

    public static void printStars(int number) {
        // part 1 of the exercise
        print(number, "*");
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        print(number, " ");
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1, j = size - 1; i <= size; i++, j--) {
            printSpaces(j);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1, j = height; i <= height * 2; i++) {
            if (i % 2 == 1) {
                j--;
                printSpaces(j);
                printStars(i);
            }
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        //printTriangle(5);
        //System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
