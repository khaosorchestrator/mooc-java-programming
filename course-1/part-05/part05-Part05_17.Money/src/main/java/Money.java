
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros(), this.cents + addition.cents());
    }

    public boolean lessThan(Money money) {
        double euros1 = Double.valueOf(this.euros + "." + this.cents);
        double euros2 = Double.valueOf(money.euros + "." + money.cents);

        return euros1 < euros2;
    }

    public Money minus(Money decreaser) {
        if (decreaser.lessThan(this)) {
            int euro = this.euros - decreaser.euros();
            int cent = this.cents - decreaser.cents();

            if (this.euros < decreaser.cents()) {
                euro--;
                cent += 100;
            }

            return new Money(euro, cent);
        }

        return new Money(0, 0);
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
