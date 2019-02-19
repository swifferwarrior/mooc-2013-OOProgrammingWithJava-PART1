
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //integers defined
        int numberDrawn = drawNumber();
        int incorrect = 0;
        int guess;

        // program your solution here. Do not touch the above lines!
        
        System.out.println(numberDrawn); // to check on number drawn
        
        while(true){
            System.out.println("Guess a number: ");
                guess = Integer.parseInt(reader.nextLine());
                
            if(guess > numberDrawn){
            incorrect++;
            System.out.println("The number is lesser, guesses made: " + incorrect);
            } else if(guess < numberDrawn) {
                incorrect++;
                System.out.println("The number is greater guesses made: " + incorrect);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }            
        }
    }
    
    //public static void guess(int incorrect){
    //    incorrect++;
    //    System.out.println(", guesses made: " + incorrect);
    //}

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
