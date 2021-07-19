
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream().forEach(System.out::println);
    }

    public void sort() {
        List<Card> newCards = new ArrayList<>();

        this.cards.stream().sorted().forEach(newCards::add);
        this.cards = newCards;
    }

    public void sortBySuit() {
        BySuitInValueOrder sortBySuit = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuit);
    }

    public int sum() {
        return this.cards.stream().reduce(0, (v, c) -> v + c.getValue(), Integer::sum);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sum() - hand.sum();
    }
}
