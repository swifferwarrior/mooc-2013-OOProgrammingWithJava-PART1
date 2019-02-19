import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        
        ArrayList<String> composers = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String composer = reader.nextLine();
            if(composer.equals("")){
                System.out.println("You typed the following words: ");
                Collections.reverse(composers);
                for(String reverseComposer : composers){
                        System.out.println(reverseComposer);
                }
                break;
            }
            composers.add(composer);
        }
    }
}
