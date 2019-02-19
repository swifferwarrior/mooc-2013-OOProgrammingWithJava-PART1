/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spoon
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        //write code here 77.1
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        //write code here 77.1
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        //write code here 77.2 + 77.3
        if(this.balance <2.5){
            return;
        } else {
        this.balance = this.balance - 2.5;
        }
    }
    
    public void payGourmet(){
        // 77.2 + 77.3
        if(this.balance < 4.0) {
            return;
        } else {
        this.balance = this.balance - 4.0;
       }
    }
    
    public void loadMoney(double amount) {
        //77.4
        if(amount < 0){
            return;
        } else {
            this.balance = this.balance + amount;
                if(this.balance > 150){
                    this.balance = 150;
                } else if(this.balance < 0){
                    return;
                }
        }
    }
    
    
    
}
