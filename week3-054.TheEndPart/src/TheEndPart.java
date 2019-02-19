import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        System.out.println("Type a word: ");
            String word = reader.nextLine();
            int wordLength = word.length();  //index value
        
        System.out.println("Length of the end part: ");
            int endLength = (Integer.parseInt(reader.nextLine()));
            int startEndPart = wordLength - endLength;
            
            String printedPart = word.substring(startEndPart, wordLength);

        
        System.out.println("Result: " + printedPart);
    }
}
