
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: ");
            String name = reader.nextLine();
            //method here
            int numberChar = calculateCharacters(name);
        System.out.println("Number of characters: " + numberChar);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    
    public static int calculateCharacters(String text){
        int characters = text.length();
        return characters;
    }
}
