
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.contains() + "/100");
            System.out.println("Second: " + secondContainer.contains() + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            System.out.println("");

            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("move")) {
                if (firstContainer.contains() > 0) {
                    if (firstContainer.contains() >= amount) {
                        secondContainer.add(amount);
                        firstContainer.remove(amount);
                    } else {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(amount);
                    }
                }
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }

}
