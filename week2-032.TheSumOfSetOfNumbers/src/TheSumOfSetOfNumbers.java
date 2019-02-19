
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int iteration = 0;
        int sum = 0;
        
        System.out.println("Until what? ");
            int until = Integer.parseInt(reader.nextLine());
            
        while(iteration <= until){
            sum = sum + iteration;
            iteration++;
        }

        System.out.println("Sum is " + sum);
    }
}
