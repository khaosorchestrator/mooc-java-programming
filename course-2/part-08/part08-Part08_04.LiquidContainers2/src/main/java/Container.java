/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.amount + amount <= 100) {
                this.amount += amount;
            } else {
                this.amount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (this.amount - amount >= 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }

    public void move(Container second, int amount) {
        if (this.contains() >= amount) {
            if (second.contains() + amount <= 100) {
                this.remove(amount);
                second.add(amount);
            } else {
                second.add(100);
                this.remove(amount);
            }
        } else {
            second.add(this.amount);
            this.remove(amount);
        }
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }

}
