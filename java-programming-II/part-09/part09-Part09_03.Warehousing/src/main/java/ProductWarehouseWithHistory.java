/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private final ChangeHistory histories;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.histories = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return this.histories.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.histories.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        this.histories.add(super.getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.histories.maxValue());
        System.out.println("Smallest amount of product: " + this.histories.minValue());
        System.out.println("Average: " + this.histories.average());
    }
}
