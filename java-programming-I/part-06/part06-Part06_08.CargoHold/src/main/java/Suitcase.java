
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.maxWeight >= item.getWeight()) {
            this.items.add(item);
            this.maxWeight -= item.getWeight();
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int value = 0;

        for (Item item : items) {
            value += item.getWeight();
        }

        return value;
    }

    public Item heaviestItem() {
        int value = 0;
        Item heavist = null;

        for (Item item : items) {
            if (item.getWeight() > value) {
                value = item.getWeight();
                heavist = item;
            }
        }

        return heavist;
    }

    @Override
    public String toString() {
        int value = 0;

        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        for (Item item : items) {
            value += item.getWeight();
        }

        String item = " item";

        if (items.size() > 1) {
            item += "s (";
        }

        return items.size() + item + value + " kg)";
    }

}
