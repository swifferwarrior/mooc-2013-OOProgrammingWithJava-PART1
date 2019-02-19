import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int iteration = 1;
        int factorial = 1;
        
        System.out.println("Type a number: ");
            int number = Integer.parseInt(reader.nextLine());

        
        while(iteration <= number){
            factorial *= iteration;
            iteration++;            
        }
        
        System.out.println("Factorial is " + factorial);

    }
}
