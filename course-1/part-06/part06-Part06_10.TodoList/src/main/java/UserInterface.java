
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
    
    private TodoList tasks;
    private Scanner scanner;
    
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
            }
            
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = this.scanner.nextLine();
                this.tasks.add(toAdd);
            }
            
            if (command.equals("list")) {
                this.tasks.print();
            }
            
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                this.tasks.remove(Integer.valueOf(this.scanner.nextLine()));
            }
        }
    }
}
