
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas ALmeida
 */
public class UserInterface {

    private final Scanner scanner;
    private final TodoList tasks;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {
        label:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    break label;
                case "add":
                    System.out.print("Task: ");
                    String task = scanner.nextLine();

                    tasks.add(task);
                    break;
                case "list":
                    this.tasks.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int taskNumber = Integer.parseInt(scanner.nextLine());
                    tasks.remove(taskNumber);
                    break;
            }
        }
    }
}
