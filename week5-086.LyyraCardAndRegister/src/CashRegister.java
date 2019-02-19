
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double economicalPrice = 2.5;
    private final double gourmetPrice = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000.0;
        this.economicalSold = 0;
        this.gourmetSold = 0;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {

        if (cashGiven >= economicalPrice) {
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven - economicalPrice;
        }

        return cashGiven;
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (cashGiven >= gourmetPrice) {
            this.cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
        }

        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double cardBalance = card.balance();

        if (cardBalance >= economicalPrice) {
            //this.cashInRegister += lunchPrice; /*this is not a card payment, not cash*/
            this.economicalSold++;
            card.pay(economicalPrice);
            return true;
        }
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double cardBalance = card.balance();

        if (cardBalance >= gourmetPrice) {
            //this.cashInRegister += lunchPrice;  /*this is not a card payment, not cash*/
            this.gourmetSold++;
            card.pay(gourmetPrice);
            return true;
        }
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }

    }

    /*public boolean negativeCheck(double entry) {
        if (entry > 0) {
            return true;
        }

        return false;
    } */  /*unnecessary*/

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
