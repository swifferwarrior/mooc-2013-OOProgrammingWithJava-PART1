
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int totalPrice = squareMeters * pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.totalPrice = this.squareMeters * this.pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        /* Returns true if the Apartment object for which the method is
        called (this) is larger than the apartment object given as
        parameter (otherApartment).
         */

        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }

        return false;
    }
    
    public int priceDifference (Apartment otherApartment) {
        int priceDifference = 0;
        
        if (moreExpensiveThan (otherApartment)) {
            priceDifference = this.totalPrice - otherApartment.totalPrice;
        } else if (!moreExpensiveThan (otherApartment)) {
            priceDifference = otherApartment.totalPrice - this.totalPrice;
        }
        
        return priceDifference;
    }
    
    public boolean moreExpensiveThan (Apartment otherApartment) {
        if(this.totalPrice > otherApartment.totalPrice) {
            return true;
        }
        
        return false;
    }
}

