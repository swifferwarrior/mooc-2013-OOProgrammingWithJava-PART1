
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        boolean legitEntry = true;
        
        ask();
        String word = reader.nextLine();
            
        while(legitEntry == true){
            words.add(word);
            ask();
            word = reader.nextLine();
            
            if(words.contains(word)){
                legitEntry = false;
                break;
            }
        }
        
        System.out.println("You gave the word " + word + " twice");
    
    }
    
    public static void ask(){
        System.out.println("Type a word: ");
    }
}
