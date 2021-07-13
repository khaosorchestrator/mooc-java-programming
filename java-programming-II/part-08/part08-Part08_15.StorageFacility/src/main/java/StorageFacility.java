
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> items;

    public StorageFacility() {
        this.items = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.items.putIfAbsent(unit, new ArrayList<>());
        this.items.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.items.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.items.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageNames = new ArrayList<>();

        for (String name : this.items.keySet()) {
            if (!this.items.get(name).isEmpty()) {
                storageNames.add(name);
            }
        }

        return storageNames;
    }
}
