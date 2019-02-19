
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does not print anything, it RETURNS the reversed string
        String reverseWord = "";
        int nameLength = text.length();
        
        char reverseLetter = text.charAt(nameLength-1);
        
        while(nameLength > 1){
            reverseWord = reverseWord + reverseLetter;
            nameLength--;
            reverseLetter = text.charAt(nameLength-1);
        }
        
        reverseWord = reverseWord + reverseLetter;
        return reverseWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
