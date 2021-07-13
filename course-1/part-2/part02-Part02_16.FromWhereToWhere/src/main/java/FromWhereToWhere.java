
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int number1 = Integer.valueOf(scanner.next());
        System.out.print("Where from? ");
        int number2 = Integer.valueOf(scanner.next());

        if (number1 >= number2) {
            for (int i = number2; i <= number1; i++) {
                System.out.println(i);
            }
        }
    }
}
