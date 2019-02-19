
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        //initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.sum = 0;
        
    }
    
    public void addNumber(int number) {
        //adds a new number to the statistics
        this.sum = this.sum + number;
        this.amountOfNumbers++;
    }
    
    public int amountOfNumbers() {
        //tells us how many numbers have been added to the statistics
        this.amountOfNumbers = amountOfNumbers;
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        double average = (double)this.sum/this.amountOfNumbers;
        
        if(this.amountOfNumbers == 0) {
            average = 0;
        }
        return average;
    }

}
