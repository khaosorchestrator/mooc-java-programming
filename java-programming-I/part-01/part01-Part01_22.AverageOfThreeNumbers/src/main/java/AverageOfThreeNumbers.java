
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numbers = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        numbers += Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        numbers += Integer.valueOf(scanner.nextLine());
        
        double average = numbers / 3.0;
        
        System.out.println("The average is " + average);

    }
}
