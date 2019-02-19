import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // INPUT NAME
        System.out.println("Type your name: ");
            String name =  reader.nextLine();
            int nameLength = wordLength(name);      //Stores as a number(1,2,3) not index (0,1,2)
        
        //CALCULATE REVERSE NAME
        String reverseWord = "";
        char reverseLetter = name.charAt(nameLength-1);
        
        while(nameLength > 1){
            reverseWord = reverseWord + reverseLetter;
            nameLength--;
            reverseLetter = name.charAt(nameLength-1);
        }
        
        reverseWord = reverseWord + reverseLetter;

        //OUTPUT REVERSE
        System.out.println("In reverse order: " + reverseWord);
        
    }
    
    public static int wordLength(String text){
        int wordLength = text.length();
        return wordLength;
    }
}
