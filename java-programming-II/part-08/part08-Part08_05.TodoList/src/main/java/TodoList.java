
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (!this.tasks.contains(task)) {
            this.tasks.add(task);
        }
    }

    public void print() {
        if (this.tasks.isEmpty()) {
            System.out.println("ToDoList is empty.");
        } else {
            int count = 1;

            for (String task : this.tasks) {
                System.out.println(count + ": " + task);
                count++;
            }
        }
    }

    public void remove(int number) {
        if (this.tasks.isEmpty()) {
            System.out.println("ToDoList is empty.");
        } else {
            this.tasks.remove(number - 1);
        }
    }

}
