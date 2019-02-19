
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 0;
        int numbering = 1;
        
        System.out.println("Type your name: ");
            String name = reader.nextLine();
            int lengthName = calculateCharacters(name);     //Example "Pekka" is lengthName=5
            char letter = name.charAt(i);                   //starts at zero
            //char lastLetter = text.charAt(text.length()-1);
        
        while(i < (lengthName-1)){// && (lengthName>3) ){         //lengthName stays the same (5)
            System.out.println(numbering + ". character: " + letter); //error happens because it prints one more time before add
            i++;
            numbering++;
            letter = name.charAt(i);  
        }
        
        System.out.println(numbering + ". character: " + letter);
    }
        
    public static int calculateCharacters(String text){
        int characters = text.length();
        return characters;
    }
}