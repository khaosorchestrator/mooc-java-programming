
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
public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird bird) {
        if (!this.birds.contains(bird)) {
            this.birds.add(bird);
        }
    }

    public void printAllBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
        }
    }

    public void printOneBird(String name) {
        if (!this.birds.isEmpty()) {
            for (Bird bird : this.birds) {
                if (bird.getName().equals(name)) {
                    System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
                    break;
                }
            }
        }
    }

    public ArrayList<Bird> getBirds() {
        return this.birds;
    }

}
