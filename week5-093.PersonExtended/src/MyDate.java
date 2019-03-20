
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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
    
    public int differneceInYears(MyDate compared) {
        return -99;
    }

  
}
