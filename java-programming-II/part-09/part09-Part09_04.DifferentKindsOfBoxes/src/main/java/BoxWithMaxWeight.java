
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
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (verifyCapacity(item)) {
            this.items.add(item);
        }
    }

    private boolean verifyCapacity(Item item) {

        int maxWeight = 0;

        for (Item i : this.items) {
            maxWeight += i.getWeight();
        }

        maxWeight += item.getWeight();
        return maxWeight <= this.capacity;

    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
