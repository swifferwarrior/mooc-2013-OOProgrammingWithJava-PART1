import java.util.Scanner;

public class Palindromi {

        public static String reverse(String text) {
            String reverseWord = "";
            int nameLength = text.length(); 
            String noChar = "Try again.";
            
            if(text.equals("")){
                return noChar;
            }
            char reverseLetter = text.charAt(nameLength-1);

            while(nameLength > 1){
                reverseWord = reverseWord + reverseLetter;
                nameLength--;
                reverseLetter = text.charAt(nameLength-1);
            }

            reverseWord = reverseWord + reverseLetter;
            return reverseWord;
        }
        
    public static boolean palindrome(String text) {
        String reverse = reverse(text);
        
        if(text.equals("")){
            return true;
        } else if(text.equals(reverse)){
            //System.out.println(reverse.length());
            //System.out.println(text.length());
            return true;
        }
        
        //System.out.println(reverse.length());
        //System.out.println(text.length());
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
        
    }
    
}
