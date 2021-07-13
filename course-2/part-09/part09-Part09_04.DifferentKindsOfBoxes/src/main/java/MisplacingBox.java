/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class MisplacingBox extends Box {

    private Item[] misplacingBox;

    public MisplacingBox() {
        this.misplacingBox = new Item[1];
    }

    @Override
    public void add(Item item) {
        this.misplacingBox[0] = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

}
