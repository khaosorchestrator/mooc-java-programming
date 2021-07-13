
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int num = Integer.valueOf(input.split(" ")[1]);

            if (command.equals("add")) {
                if (num > 0) {
                    if (firstContainer + num <= 100) {
                        firstContainer += num;
                    } else {
                        firstContainer = 100;
                    }
                }
            }

            if (command.equals("move")) {
                if (num > 0 && firstContainer > 0) {
                    if (firstContainer >= num) {
                        if (secondContainer + num <= 100) {
                            firstContainer -= num;
                            secondContainer += num;
                        } else {
                            secondContainer = 100;
                            firstContainer -= num;
                        }
                    } else {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    }
                }
            }

            if (command.equals("remove")) {
                if (num > 0) {
                    if (secondContainer > num) {
                        secondContainer -= num;
                    }
                }
            }
        }
    }

}
