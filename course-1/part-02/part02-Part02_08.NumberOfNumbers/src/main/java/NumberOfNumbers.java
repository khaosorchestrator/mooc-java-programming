
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.next());

            if (number == 0) {
                break;
            }

            numberOfNumbers++;
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
    }
}
