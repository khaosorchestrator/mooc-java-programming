/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Counter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
        this();
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int value) {
        if (value > 0) {
            this.value += value;
        }
    }

    public void decrease(int value) {
        if (value > 0) {
            this.value -= value;
        }
    }
}
