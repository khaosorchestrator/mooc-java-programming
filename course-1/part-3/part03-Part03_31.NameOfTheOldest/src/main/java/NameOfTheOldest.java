
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String nameOfOldest = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] persons = input.split(",");

            if (Integer.valueOf(persons[1]) > oldestAge) {
                oldestAge = Integer.valueOf(persons[1]);
                nameOfOldest = persons[0];
            }

        }

        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
