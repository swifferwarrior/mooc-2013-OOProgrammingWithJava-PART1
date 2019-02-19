import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random; //added this to allow for randomness in the methods.

    public LotteryNumbers() {
        //CONSTRUCTOR
        this.random = new Random(); //added to for randomness in each list object.
        this.numbers = new ArrayList<Integer>(); //a dynamic integer to hold a list of numbers
        this.drawNumbers();//draws numbers as LotteryNumbers is created
    }

    public ArrayList<Integer> numbers() {
        //returns the drawn numbers of this draw
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>(); // We'll format a list for the numbers
        int i = 0;  //counter
        int number; //each individual drawn number;
        
        while (i < 7){
            number = this.random.nextInt(39)+1;     //calls up a number but doesn't add it yet
            if (!containsNumber(number)){           //if it's not a duplicate...
                    this.numbers.add(number);       //...add it to the list
                    i++;
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        //reveals if the number is among the drawn numbers
        for (int value : this.numbers) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}
