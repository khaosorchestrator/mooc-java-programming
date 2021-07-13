/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Book {

    private String name;
    private int recommendation;

    public Book(String name, int recommendation) {
        this.name = name;
        this.recommendation = recommendation;
    }

    public String getName() {
        return name;
    }

    public int getRecommendation() {
        return recommendation;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.recommendation + " year-olds or older)";
    }
}
