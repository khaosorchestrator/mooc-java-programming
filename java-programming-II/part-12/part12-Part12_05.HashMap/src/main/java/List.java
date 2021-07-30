/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 * @param <T>
 */
public class List<T> {

    private T[] values;
    private int size;

    public List() {
        this.values = (T[]) new Object[10];
    }

    public void add(T value) {
        if (this.size == this.values.length) {
            growList();
        }
        this.values[this.size] = value;
        size++;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public int size() {
        return this.size;
    }

    public int indexOf(T value) {
        for (int i = 0; i < this.size; i++) {
            if (this.values[i] == value || this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public T value(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.size + "]");
        }

        return this.values[index];
    }

    public void remove(T value) {
        int index = indexOf(value);

        if (index < 0) {
        }

        moveToTheLeft(index);
        this.size--;
    }

    private void growList() {
        T[] newValues = (T[]) new Object[this.values.length + this.values.length / 2];

        for (int i = 0; i < this.size; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.size - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
}