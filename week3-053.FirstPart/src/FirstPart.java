
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a word: ");
            String word = reader.nextLine();
            int wordLength = word.length();  //index value
        
        System.out.println("Length of the first part: ");
            int firstPart = (Integer.parseInt(reader.nextLine()));
            String printedPart = word.substring(0, firstPart);

        
        System.out.println("Result: " + printedPart);
    }
}
