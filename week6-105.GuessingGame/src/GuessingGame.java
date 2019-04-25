
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        //You'll need at least one loop and a query in which you ask the user
        //if their number is greater than the average of the lowerLimit and upperLimit
        //Change the upperLimit or lowerLimit depending on the user's reply.
        //Keep doing the loop until the upper and lower are the same!
        int answer;
        
        instructions(lowerLimit, upperLimit);

        while (true) {
            if (lowerLimit == upperLimit) {
                System.out.println("The number you're thinking of is " + lowerLimit + ".");
                break;
            }

            if (isGreaterThan(average(lowerLimit, upperLimit))) {
                lowerLimit = average(lowerLimit, upperLimit)+1;
                //} else if (!isGreaterThan(average(lowerLimit, upperLimit))) {
            } else {
                upperLimit = average(lowerLimit, upperLimit);
            }
        }

        //if (lowerLimit == upperLimit) {
        //}
    }

    // implement here the methods isGreaterThan and average
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        boolean answer = false;

        System.out.println("Is your number greater than " + value + "? (y/n)");
        String response = reader.nextLine();

        if (response.equals("y")) {
            //System.out.println("true");
            answer = true;
        } else if (response.equals("n")) {
            //System.out.println("false");
            answer = false;
        }

        return answer;
    }

    public int average(int firstNumber, int secondNumber) {
        //calculates the average of the given values
        int average = (firstNumber + secondNumber) / 2;
        return average;
    }
}
/* POST-SUBMIT NOTES */ 
/*
1. ADJUSTING THE LOWER LIMIT
        When adjusting the lower limit, add a +1 otherwise the lower limit will
        not meet up with the upper limit. 
2. REGARDING PLAY()
        The while() loop condition whould be while(true) instead of (lowerLimit != upperLimit)
        If the condition would be (lowerLimit != upperLimit) then it would never
        break upon the condition that upperLimit == lowerLimit.
*/