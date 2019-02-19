
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true){
                System.out.println("What is the temperature?");
                double temp = Double.parseDouble(reader.nextLine());
                
                if (temp <= -30) {
                    System.out.println("Too cold! No way!");
                } else if (temp >= 40){
                    System.out.println("Too hot! No way!");
                } else {
                    System.out.println("Temperature added.");
                    Graph.addNumber(temp);

                }
        }
    }
}

        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.