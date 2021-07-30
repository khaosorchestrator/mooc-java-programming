
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many numbers should be printed?");
        int number = scanner.nextInt();
        
        for (int i = 0; i < number; i++) {
            System.out.println(new Random().nextInt(11));
        }
    }

}
