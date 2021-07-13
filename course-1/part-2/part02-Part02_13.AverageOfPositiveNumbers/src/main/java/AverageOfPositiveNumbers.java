
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageOfPositive = 0;
        int countPositive = 0;

        while (true) {
            int number = Integer.valueOf(scanner.next());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                countPositive++;
                averageOfPositive += number;
            }
        }

        if (countPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            averageOfPositive /= countPositive;
            System.out.println(averageOfPositive);
        }
    }
}
