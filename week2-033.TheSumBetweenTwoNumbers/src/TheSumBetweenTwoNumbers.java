
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int nextAdd = 0;
        int sum = 0;
        
        System.out.println("First: ");
            int first = Integer.parseInt(reader.nextLine());
            sum = first;
            nextAdd = sum + 1;
        System.out.println("Last: ");
            int untilLast = Integer.parseInt(reader.nextLine());
            
        while(nextAdd <= untilLast){
            sum = sum + nextAdd;
            nextAdd++;
        }

        System.out.println("Sum is " + sum);
    }
}
