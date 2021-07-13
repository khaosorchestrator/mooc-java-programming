
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehiclRegistry;

    public VehicleRegistry() {
        this.vehiclRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.vehiclRegistry.containsKey(licensePlate)) {
            this.vehiclRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!this.vehiclRegistry.containsKey(licensePlate)) {
            return null;
        }

        return this.vehiclRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.vehiclRegistry.containsKey(licensePlate)) {
            return false;
        }
        this.vehiclRegistry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vehiclRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : this.vehiclRegistry.values()) {
            if (!owners.contains(owner)) {
                System.out.println(owner);
            }
            owners.add(owner);
        }
    }
}
