/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class OneItemBox extends Box {

    private Item oneItem;

    @Override
    public void add(Item item) {
        if (this.oneItem == null) {
            this.oneItem = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.oneItem != null && this.oneItem.equals(item);
    }

}
