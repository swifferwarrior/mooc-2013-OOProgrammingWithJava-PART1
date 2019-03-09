
public class Clock {

    private BoundedCounter hours = new BoundedCounter(23);
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds = new BoundedCounter(59);
    //bounded counters have a value and upperlimit

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and 
        //set to have the correct initial values
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        // Clock advances by one second
        /*If the seconds reset, the minutes advance once until 60
          If the minutes reset, the hours advance once until 24*/
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
        }
        if (this.minutes.getValue() == 0 && this.seconds.getValue() == 0) {
            this.hours.next();
        }
    }
    
    

    public String toString() {
        // returns the string representation
        String hours = this.hours.toString();
        String minutes = this.minutes.toString();
        String seconds = this.seconds.toString();

        return hours + ":" + minutes + ":" + seconds;
    }
}

//POST-SUBMIT NOTES//
/*
First problem was setting upper limit of the bounded counters to 24,60,60 instead of 23,59,59
Second problem was advancing the seconds by one with 'next()' but not advancing the minutes  
    and hours when resetting the seconds
Third problem was not initializing the variables in the toString. A related problem
    was trying to initialize the values as integers and then storing the integers
    in Strings, making an extra, unecessary step.
*/
