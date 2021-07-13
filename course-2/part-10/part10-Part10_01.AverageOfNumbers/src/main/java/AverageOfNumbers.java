
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // Write your program here

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String values = scanner.nextLine();

            if (values.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(values));
        }

        double average = numbers.stream()
            .mapToInt(s -> s)
            .average()
            .getAsDouble();
        System.out.println("Average of the numbers: " + average);
    }
}
