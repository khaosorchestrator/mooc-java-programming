
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowLimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowLimit + ", " + upperLimit + "]");
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) >= lowLimit && numbers.get(i) <= upperLimit) {
                System.out.println(numbers.get(i));
            }
        }
    }

    public static void main(String[] args) {
        // Try your method here
    }

}
