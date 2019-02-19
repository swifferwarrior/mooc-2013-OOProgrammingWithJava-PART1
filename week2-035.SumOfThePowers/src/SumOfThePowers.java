
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int iteration = 0;
        int power = 0;
        int sumPower = 0;
        
        System.out.println("Type a number: ");
            int number = Integer.parseInt(reader.nextLine());

        while(iteration <= number){
            power = (int)Math.pow(2,iteration);
            sumPower += power;
            iteration++;
        }
        System.out.println("The result is " + sumPower);

    }
}
