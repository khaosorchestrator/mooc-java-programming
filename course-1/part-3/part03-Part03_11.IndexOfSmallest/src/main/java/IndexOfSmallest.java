
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int smallestNumber = 0;

        while (true) {
            int number = scanner.nextInt();
            
            if (number == 9999) {
                break;
            }
            
            numbers.add(number);
        }

        smallestNumber = numbers.get(0);
        
        for (int number: numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        
        System.out.println("Smallest number: " + smallestNumber);
        int index = 0;

        for (int number : numbers) {
            if (number == smallestNumber) {
                System.out.println("Found at index: " + index);
            }
            index++;
        }
    }
}
