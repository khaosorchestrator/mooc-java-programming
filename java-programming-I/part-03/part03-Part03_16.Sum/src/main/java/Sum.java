
import java.util.ArrayList;

public class Sum {

    public static int sum(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return -1;
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Try your method here
    }

}
