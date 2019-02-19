
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        //Test 1 Divisible by 4, Test 2 Divisible by 100, Test 3 Divisible by 400
        if (year % 4 == 0){                                             //Test 1
            if (year % 400 != 0){                                       //Test 3
                if (year % 100 != 0){                                   //Test 2
                    System.out.println("The year is a leap year.");     //If test 1 is true
                } else {
                    System.out.println("The year is NOT a leap year."); //Passes test 2 but not 3
                }
            } else {
                System.out.println("The year IS a leap year.");         //Passes all 3 tests
            }
        } else {
            System.out.println("1 The year is not a leap year.");       //If test 1 is false.
        }

        //This means that MOST LIKELY the decision tree starts with test 1 then
        //works it's way backwards. (If there are 4 tests, the next IF statement
        //would be for text for, then test 3, then test 2, etc.
        
    }
}
