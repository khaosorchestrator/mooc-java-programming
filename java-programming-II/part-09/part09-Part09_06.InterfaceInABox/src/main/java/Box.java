
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
public class Box implements Packable {

    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (isNotFull(item)) {
            this.items.add(item);
        }
    }

    public boolean isNotFull(Packable item) {
        return this.weight() + item.weight() <= this.capacity;
    }

    @Override
    public double weight() {
        double totalWeight = 0;

        for (Packable item : this.items) {
            totalWeight += item.weight();
        }

        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }

}
