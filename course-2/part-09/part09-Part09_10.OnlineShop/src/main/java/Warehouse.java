
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> quantities;

    public Warehouse() {
        this.products = new HashMap<>();
        this.quantities = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        if (0 < price && stock > 0) {
            this.products.put(product, price);
            this.quantities.put(product, stock);
        }
    }

    public int price(String product) {
        if (!this.products.containsKey(product)) {
            return -99;
        }
        return this.products.get(product);
    }

    public int stock(String product) {
        if (!this.quantities.containsKey(product)) {
            return 0;
        }

        return this.quantities.get(product);
    }

    public boolean take(String product) {
        if (stock(product) == 0) {
            return false;
        }

        this.quantities.put(product, stock(product) - 1);
        return true;
    }

    public Set<String> products() {
        return this.products.keySet();
    }
}
