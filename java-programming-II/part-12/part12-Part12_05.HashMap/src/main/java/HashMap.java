/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 * @param <K>
 * @param <V>
 */
public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int size;

    public HashMap() {
        this.values = new List[32];
        this.size = 0;
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % this.values.length);

        if (this.values[hash] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hash];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }

        return null;
    }

    public void put(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = this.getListBasedOnKey(key);
        int index = this.getKeyIndex(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.size++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }

        if (1.0 * this.size / this.values.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);

        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getKeyIndex(valuesAtIndex, key);

        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);

        return pair.getValue();
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hash = Math.abs(key.hashCode() % values.length);

        if (values[hash] == null) {
            values[hash] = new List<>();
        }

        return values[hash];
    }

    private int getKeyIndex(List<Pair<K, V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.value(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {
        List<Pair<K, V>>[] newValues = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newValues, i);
        }

        this.values = newValues;
    }

    private void copy(List<Pair<K, V>>[] array, int fromIndex) {
        for (int i = 0; i < this.values[fromIndex].size(); i++) {
            Pair<K, V> value = this.values[fromIndex].value(i);
            int hash = Math.abs(value.getKey().hashCode() % array.length);

            if (array[hash] == null) {
                array[hash] = new List<>();
            }

            array[hash].add(value);
        }
    }
}
