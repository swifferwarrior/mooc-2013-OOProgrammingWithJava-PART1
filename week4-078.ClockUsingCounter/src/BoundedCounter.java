/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spoon
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
            if (this.value < 0){
                this.value = 0;
                return;
            }
        this.upperLimit = upperLimit;
    }
    
    public void next(){
        //increments the value of the counter.
        //if the value would be more that the upper limit, it wraps around to zero
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() {
        if(this.value < 10){
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }
    
    public int getValue() {
        //write here code that returns the value
        return this.value;
    }
    
    public void setValue(int value){
        if(value < 0){
            value = 0;
        } else if(value > this.upperLimit){
            value = 0;
        }
        this.value = value;
    }
}
