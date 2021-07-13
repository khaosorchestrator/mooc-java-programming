
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.next());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += number;
            numberOfNumbers++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);

        average = (sum + 0.0) / (numberOfNumbers + 0.0);
        System.out.println("Average: " + average);

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
