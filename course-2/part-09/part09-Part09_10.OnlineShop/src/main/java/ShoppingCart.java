
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class ShoppingCart {

    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }

    public void add(String product, int price) {
        if (price > 0) {
            if (this.products.containsKey(product)) {
                Item item = this.products.get(product);
                item.increaseQuantity();
                this.products.put(product, item);
            } else {
                Item newItem = new Item(product, 0, price);
                newItem.increaseQuantity();
                this.products.put(product, newItem);
            }
        }
    }

    public int price() {
        int totalPrice = 0;

        for (Item item : this.products.values()) {
            totalPrice += item.price();
        }

        return totalPrice;
    }

    public void print() {
        for (Item item : this.products.values()) {
            System.out.println(item);
        }
    }
}
