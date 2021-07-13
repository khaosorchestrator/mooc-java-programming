
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
public class Herd implements Movable {

    private ArrayList<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable herd) {
        this.herds.add(herd);
    }

    @Override
    public String toString() {
        String myHerds = "";

        for (Movable held : this.herds) {
            myHerds += held + "\n";
        }

        return myHerds;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable held : this.herds) {
            held.move(dx, dy);
        }
    }

}
