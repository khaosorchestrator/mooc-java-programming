
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] persons = input.split(",");

            if (Integer.valueOf(persons[1]) > oldestAge) {
                oldestAge = Integer.valueOf(persons[1]);
            }

        }

        System.out.println("Age of the oldest: " + oldestAge);

    }
}
