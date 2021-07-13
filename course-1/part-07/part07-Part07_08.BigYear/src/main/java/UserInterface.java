
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class UserInterface {

    private Scanner scanner;
    private BirdDatabase db;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.db = new BirdDatabase();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = this.scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = this.scanner.nextLine();
                this.db.add(new Bird(name, latinName));
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = this.scanner.nextLine();

                boolean value = true;

                for (Bird bird : this.db.getBirds()) {
                    if (bird.getName().equals(name)) {
                        bird.addObservation();
                        value = false;
                    }
                }

                if (value) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                this.db.printAllBirds();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = this.scanner.nextLine();
                this.db.printOneBird(name);
            }

            if (command.equals("Quit")) {
                break;
            }
        }
    }
}
