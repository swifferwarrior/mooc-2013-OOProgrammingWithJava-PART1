
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int dividend = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int divisor = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division: " + dividend + " / " + divisor + " = " + ((double)dividend/divisor));

        // Implement your program here. Remember to ask the input from user.
    }
}
