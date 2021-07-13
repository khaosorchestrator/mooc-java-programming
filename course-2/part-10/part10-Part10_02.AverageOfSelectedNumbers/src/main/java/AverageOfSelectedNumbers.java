
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // toteuta ohjelmasi tänne

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String value = scanner.nextLine();

            if (value.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(value));
        }

        System.out.println("");
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("n")) {
            System.out.println("Average of the negative numbers: " + numbers.stream()
                    .filter(s -> s < 0)
                    .mapToInt(s -> s)
                    .average()
                    .getAsDouble());
        } else if (input.equals("p")) {
            System.out.println("Average of the positive numbers: " + numbers.stream()
                    .filter(s -> s > 0)
                    .mapToInt(s -> s)
                    .average()
                    .getAsDouble());
        }

    }
}
