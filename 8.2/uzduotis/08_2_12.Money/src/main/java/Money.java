import java.awt.*;
import java.util.Random;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        } else if (euros < 0 || cents < 0) {
            euros = 0;
            cents = 0;

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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(addition.euros() + euros, addition.cents() + cents);

    }

    public boolean lessThan(Money compared) {
        return euros < compared.euros() || euros == compared.euros() && cents < compared.cents();
    }

    public Money minus(Money decreaser) {
        if (cents < decreaser.cents) {
            return new Money((euros - 1) - decreaser.euros(), 100 - decreaser.cents());
        }

        return new Money(euros - decreaser.euros(), cents - decreaser.cents());
    }

}
