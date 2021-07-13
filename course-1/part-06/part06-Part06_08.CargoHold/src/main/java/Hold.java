
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight >= suitcase.totalWeight()) {
            this.suitcases.add(suitcase);
            maxWeight -= suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int value = 0;

        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        for (Suitcase suitcase : suitcases) {
            value += suitcase.totalWeight();
        }

        String suitcase = " suitcase";

        if (suitcases.size() != 1) {
            suitcase += "s (";
        }

        return suitcases.size() + suitcase + value + " kg)";
    }

}
