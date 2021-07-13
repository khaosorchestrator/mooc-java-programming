
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.next());
        int fat = 1;
        
        for (int i = 1; i <= number; i++) {
            fat *= i;
        }
        
        System.out.println("Factorial: " + fat);
    }
}
