/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spoon
 */
public class Counter {
    //holds a number that can be decreased and increased. The counter also has
    //an optional check that prevents counter from going below 0. The class has
    //to have specific constructors

    private int counter;
    private boolean check;

    //CONSTRUCTORS
    public Counter(int startingValue, boolean check) {
        //Creates a new counter with the given value
        //The check is on if the parameter given to check was true
        this.counter = startingValue;
        this.check = check;

    }

    public Counter(int startingValue) {
        //creates a new counter with the given value
        //the check on the new counter should be off.
        this(startingValue, false);
    }

    public Counter(boolean check) {
        //creates a new counter with the starting value 0. 
        //The check is on if the parameter given to check was true.
        this(0, check);
    }

    public Counter() {
        //creates a new counter with the starting value of 0 and with checking off
        this(0, false);
    }

    //METHODS
    //84.1
    public int value() {
        //returns the value of the counter
        return this.counter;
    }

    public void increase() {
        //increases the value of the counter by one
        this.increase(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0){
            this.counter += increaseAmount;
        }
    }

    public void decrease() {
        //decreaes the value of the counter by one,
        //BUT not below 0 if the check is on
        this.decrease(1);
    }

    public void decrease(int decreaseAmount) {
        //decreases the value of the counter by the amount given by the parameter,
        //BUT not below 0 if the check is on
        //If the value of the parameter is (-), the value of the counter will not change
        if (decreaseAmount > 0) {                       //Prevents -number entries
            if (this.check) {
                this.counter -= decreaseAmount;
                
                if(this.counter < 0){
                    this.counter = 0;
                }
            } else if (!this.check) {
                this.counter -= decreaseAmount;
            }
        } else {
            System.out.println("Entry must be positive.");
        }
    }
}
