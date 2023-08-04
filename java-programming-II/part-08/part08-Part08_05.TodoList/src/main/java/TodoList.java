import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Lucas ALmeida
 */
public class TodoList {

    private final List<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        if (tasks.contains(task)) {
            return;
        }

        tasks.add(task);
    }

    public void print() {
        if (tasks.isEmpty()) {
            System.out.println("ToDoList is empty.");
            return;
        }

        int count = 1;

        for (String task : tasks) {
            System.out.println(count + ": " + task);
            count++;
        }
    }

    public void remove(int number) {
        if (tasks.isEmpty()) {
            System.out.println("ToDoList is empty.");
            return;
        }

        tasks.remove(number - 1);
    }

}
