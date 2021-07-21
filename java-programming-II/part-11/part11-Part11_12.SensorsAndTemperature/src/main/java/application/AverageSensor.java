/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class AverageSensor implements Sensor {

    private final List<Sensor> sensors;
    private final List<Integer> reads;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.reads = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().filter(Sensor::isOn).count() == sensors.size();
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensors.get(0).setOff();
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException("The AverageSensor is off or it's empty!");
        }

        int average = this.sensors.stream().reduce(0, (v, s) -> v + s.read(), Integer::sum) / this.sensors.size();
        this.reads.add(average);
        return average;
    }

    public List<Integer> readings() {
        return this.reads;
    }
}
