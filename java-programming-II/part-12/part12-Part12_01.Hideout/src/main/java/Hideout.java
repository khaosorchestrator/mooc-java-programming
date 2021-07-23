/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Hideout<T> {

    private T hideValue;

    public void putIntoHideout(T toHide) {
        this.hideValue = toHide;
    }

    public T takeFromHideout() {
        T newValue = this.hideValue;
        this.hideValue = null;
        return newValue;
    }

    public boolean isInHideout() {
        return this.value != null;
    }
}
