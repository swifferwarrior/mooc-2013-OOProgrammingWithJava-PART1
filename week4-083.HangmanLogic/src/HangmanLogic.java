
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        
        if (this.guessedLetters.contains(letter)){                      //If you've already guessed letter...
            //return;                                                         //...do nothing
        }
        
        if ((!this.word.contains(letter)) && (!this.guessedLetters.contains(letter))){                        //If wrong, tally the fault and guesses
            this.numberOfFaults++;
            this.guessedLetters += letter;
        }
        
        if (this.word.contains(letter)){                       //If right, just tally the guesses
            this.guessedLetters += letter;
            return;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";
        int length = this.word.length();
        int i = 0;
        
        
        while(i < (length)) {
            char a = this.word.charAt(i);
            char b = '_';
            String letter = "" + a;
        
            if(this.guessedLetters.contains(letter)) {
                hiddenWord += letter;
                i++;
            } else {
                hiddenWord += b;
                i++;
            }
            
        }
        
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        return hiddenWord;
    }
}
