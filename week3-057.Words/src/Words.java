import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        //Setting true-false switch
        boolean legitEntry = true;  //I'm not supposed to know the use of "!" in parameters yet
                                    //but I was already taught boolean.
        
        //Initial input (with method for repetitive print and word check)
        ask();
        String word = reader.nextLine();
        
        //Off switch to end loop
        if(word.isEmpty()){
            legitEntry = false;
        }
        
        //Loop for input and word check
        while (legitEntry == true){
            words.add(word);
            ask();
            word = reader.nextLine();
            
            if(word.isEmpty()){
                legitEntry = false;
            }
        }
        
        //Printing results
        for (String entry : words){
            System.out.println(entry);   
        }
}
    
    public static void ask(){
        System.out.println("Type a word: ");
    }
}

//sorry, not pretty but completed with the tools I'm supposed to know up to this point!