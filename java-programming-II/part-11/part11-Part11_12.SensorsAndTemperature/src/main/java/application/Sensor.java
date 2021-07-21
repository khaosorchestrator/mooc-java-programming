/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author lucas
 */
public interface Sensor {

    boolean isOn();

    void setOn();

    void setOff();

    int read();
}
