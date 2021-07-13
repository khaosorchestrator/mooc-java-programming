
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            System.out.println("");

            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);

            if (command.equals("add")) {
                if (amount >= 0 || amount + first >= 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            }

            if (command.equals("move")) {
                if (first != 0) {
                    if (first >= amount) {
                        if (second + amount >= 100) {
                            second = 100;
                        } else {
                            second += amount;
                        }
                        first -= amount;
                    } else {
                        second = first;
                        first = amount - first;
                    }
                }
            }

            if (command.equals("remove")) {
                if (second != 0) {
                    if (second >= amount) {
                        second -= amount;
                    }
                }
            }

        }
    }

}
