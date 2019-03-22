
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int euros = this.euros + added.euros();
        int cents = this.cents + added.cents();
        
        if (cents > 99){
            cents -= 100;
            euros++;
        }

        return new Money(euros, cents);

        /*this.euros += added.euros();
        this.cents += added.cents();
        return new Money(this.euros, this.cents);*/
    }

    public boolean less(Money compared) {
        //returns true if method-calling object is less valuable than the parameter object
        int totalOfSubject = (this.euros() * 100) + this.cents();
        int totalOfCompared = (compared.euros() * 100) + compared.cents();

        if (totalOfSubject < totalOfCompared) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int lessEuros = this.euros - decremented.euros();
        int lessCents = this.cents - decremented.cents();

        if (lessCents < 0) {
            lessEuros--;
            lessCents += 100;
        }

        if (lessEuros <= 0 /*&& cents <= 0*/) {
            lessEuros = 0;
            lessCents = 0;
        }

        return new Money(lessEuros, lessCents);

    }
}

/* POST-SUBMIT NOTES */
 /*
1. ALTERING THIS.VARIABLE VS A METHOD-ONLY VARIABLE
        Originally tried this.euros += added.euros(); but that would alter a final variable (or try to)
        Instead, created a variable used only within the method and passed that on to the new Money object
        The fault code was commented out for reference.
2. TRIGGERING A MONEY FLOOR OF ZERO
        Tried to set too many criteria at once instead of a series of if() statements
        in minus(), which meant that the last println(c) had a negative value. BOTH criteria
        had to be met in the faulty version. I made the criteria separate instead
        of nested and the second if() parameters only required the lessEuros() check.
3. TOO MUCH CENTS
    In the sum() method, there wasn't a condition set for when cents go over 99 cents.
    Added an opposite effect from the minus() method to turn 100 cents into a Euro.
 */
