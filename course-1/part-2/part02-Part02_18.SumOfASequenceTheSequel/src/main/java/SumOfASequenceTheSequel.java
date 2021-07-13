
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.next());

        System.out.print("Second number? ");
        int secondNumber = Integer.valueOf(scanner.next());
        int sum = 0;

        if (firstNumber > secondNumber) {
            int aux = firstNumber;
            firstNumber = secondNumber;
            secondNumber = aux;
        }

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }
}
