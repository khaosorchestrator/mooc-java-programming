
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class ChangeHistory {

    private final ArrayList<Double> histories;

    public ChangeHistory() {
        this.histories = new ArrayList<>();
    }

    public void add(double status) {
        this.histories.add(status);
    }

    public void clear() {
        this.histories.clear();
    }

    public double maxValue() {
        if (this.histories.isEmpty()) {
            return 0;
        }

        double maxValue = 0;

        for (double value : this.histories) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public double minValue() {
        if (this.histories.isEmpty()) {
            return 0;
        }

        double minValue = this.histories.get(0);

        for (double value : this.histories) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public double average() {
        if (this.histories.isEmpty()) {
            return 0;
        }

        double average = 0;

        for (double value : this.histories) {
            average += value;
        }

        return average / this.histories.size();
    }

    @Override
    public String toString() {
        return this.histories.toString();
    }
}
