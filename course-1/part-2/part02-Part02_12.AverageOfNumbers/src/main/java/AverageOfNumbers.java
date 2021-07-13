
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumAndAverage = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.next());

            if (number == 0) {
                break;
            }
            count++;
            sumAndAverage += number;
        }
        
        sumAndAverage /= count;
        System.out.println("Average of the numbers: " + sumAndAverage);
    }
}
