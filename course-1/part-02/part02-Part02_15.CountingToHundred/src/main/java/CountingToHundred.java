
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.next());
        
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
