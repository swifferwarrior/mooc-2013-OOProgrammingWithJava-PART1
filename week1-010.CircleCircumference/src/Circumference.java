
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine()); 
        double circumfrence = 2 * Math.PI * radius;
        
        System.out.println("Circumfrence of the circle: " + circumfrence);
        // Program your solution here 
    }
}
