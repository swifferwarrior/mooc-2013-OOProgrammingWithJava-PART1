import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 0;
        int numbering = 1;
        
        System.out.println("Type your name: ");
            String name = reader.nextLine();
            int lengthName = calculateCharacters(name);
            char letter = name.charAt(i);       
        
        while((i < 3) && (lengthName>3) ){
            System.out.println(numbering + ". character: " + letter);
            i++;
            numbering++;
            letter = name.charAt(i);
            
        }
        
    }
        
    public static int calculateCharacters(String text){
        int characters = text.length();
        return characters;
    }
}
