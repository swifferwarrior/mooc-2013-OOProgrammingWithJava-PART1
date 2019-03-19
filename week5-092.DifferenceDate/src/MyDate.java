public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate){
        //calculates the difference in the years of the object for which the 
        //method is called and object given as parameters

        /* The old Italian spaghetti way
        int differenceYear = 0;
        int differenceMonth = 0;
        int differenceDay = 0;
        int totalDays = 0;
        int totalYears = 0;
        
        if (!earlier(comparedDate)) {
            differenceYear = (this.year*365) - (comparedDate.year*365);
            differenceMonth = (this.month*30) - (comparedDate.month*30);
            differenceDay = this.day - comparedDate.day;
            
            totalDays = differenceYear + differenceMonth + differenceDay;
            totalYears = totalDays/360;

        }
        return totalYears;
        */
        
        int totalDays = 0;
        int totalYears = 0;
        int thisDateInDays = (this.year*365)+(this.month*30)+this.day;
        int comparedDateInDays = (comparedDate.year*365)+(comparedDate.month*30) + comparedDate.day;
        
        if (!earlier(comparedDate)) {
            totalDays = thisDateInDays - comparedDateInDays;
            totalYears = totalDays / 365;
        } else if(earlier(comparedDate)) {
            totalDays = comparedDateInDays - thisDateInDays;
            totalYears = totalDays / 365;
        }
        
        return totalYears;
        
    }
}

/* POST-SUBMIT NOTES */ 
/*
1. OBJECTS CAN USE METHODS
    Don't forget that MyDate objects can have .methods() too!
2. CONVERTED DATES INTO TOTAL DAYS FOR THE CALCULATIONS
    To make the differenceInYears more accurate, I broke down years and months into
    days, did the calculation, then converted it back to years without remainders.
3. CLEANED UP THE CODE
    To make the code less spaghetti, combined the "this" integers and "compared" integers
    to cut out the unecessary integers. Made 2 calculations instead of 5! Commented 
    out the spaghetti code to help others learn from my mistakes.
*/
