
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            numbers.add(number);
            sum += number;
        }

        int size = numbers.size();

        double average = (sum * 1.0) / (size * 1.0);
        System.out.println("Average: " + average);
    }
}
