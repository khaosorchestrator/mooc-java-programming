/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class TemperatureSensor implements Sensor {

    private boolean value;

    @Override
    public boolean isOn() {
        return this.value;
    }

    @Override
    public void setOn() {
        this.value = true;
    }

    @Override
    public void setOff() {
        this.value = false;
    }

    @Override
    public int read() {
        if (!this.value) {
            throw new IllegalStateException("The Sensor is Off!");
        }

        return new Random().nextInt(61) - 30;
    }
}
