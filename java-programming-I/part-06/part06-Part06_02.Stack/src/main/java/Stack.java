
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
public class Stack {

    public ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        ArrayList<String> newStack = new ArrayList<>();
        newStack.add(value);

        for (String stk : stack) {
            newStack.add(stk);
        }

        stack = newStack;
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        return stack.remove(0);
    }

    @Override
    public String toString() {
        String stackValues = "[";

        for (String value : stack) {
            stackValues += value;
        }

        stackValues += "]";

        return stackValues;

    }

}
