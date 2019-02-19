import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
            String name = reader.nextLine();
            
        char lastLetter = lastCharacter(name);
        
        System.out.println("Last character: " + lastLetter);
    }
    
    public static char lastCharacter(String text){
        char lastLetter = text.charAt(text.length()-1);
        return lastLetter;
    }
}
