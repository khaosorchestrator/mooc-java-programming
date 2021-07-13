
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int longestNameLength = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] persons = input.split(",");

            if (persons[0].length() > longestNameLength) {
                longestName = persons[0];
                longestNameLength = persons[0].length();
            }

            sum += Integer.valueOf(persons[1]);
            count++;
        }

        double average = sum * 1.0 / count * 1.0;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
