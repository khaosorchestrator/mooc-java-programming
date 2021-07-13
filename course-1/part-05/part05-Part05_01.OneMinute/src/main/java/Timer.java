/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Timer {

    private ClockHand hundredths;
    private ClockHand seconds;
    private int value;

    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
        this.value = 0;
    }

    public void advance() {
        this.hundredths.advance();
        this.value++;

        if (value == 100) {
            this.seconds.advance();
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }

}
