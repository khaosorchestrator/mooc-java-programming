
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
    private TodoList tasks;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("Task: ");
                String task = this.scanner.nextLine();

                this.tasks.add(task);
            } else if (command.equals("list")) {
                this.tasks.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int taskNumber = Integer.valueOf(this.scanner.nextLine());
                this.tasks.remove(taskNumber);
            }
        }
    }
}
