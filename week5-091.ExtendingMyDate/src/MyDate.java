
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
    
    public void advance(){
        this.day++;
        
        if(this.day == 31){
            this.day = 1;
            this.month++;
        }
        
        if(this.month == 13 /*&& this.day == 31*/){
            this.month = 1;
            this.year++;
        }
    }
    
    public void advance(int numberOfDays){
        int i = 1;
        
        while(i <= numberOfDays){
            this.advance();
            i++;
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        
        newMyDate.advance(days);
        
        return newMyDate;
    }

}

/* POST-SUBMIT NOTES*/
/*
1. Rolling counter
    advance() is more than just this.day++
    It has to reset after 30 and then advance the month. Likewise with months and
    years.
2. Advancing a whole week
    The main program ran once and only advanced a day at a time. Possibly due to 
    writing 'this.day.advance()' on linke 53.
3. If vs while
    Accidentally typed if(i <= numberOfDays) on line 52. When there is an i=instance
    there is a good chance that it is a 'while' loop.
4. Problem with advance()
    When calling the advance() method, rolling over to a new year did not require
    the month to go over 12 AND the days to go over 30. I commented out the 
    'day == 31'
*/
