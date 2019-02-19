import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;
    private String password;
    int i;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.password = "";
        this.i = 0;
        // Initialize the variable
    }

    public String createPassword() {
        String sampleBase = "abcdefghijklmnopqrstuvwxyz";
        //int sampleLength = wordLength(sampleBase);
        char randomLetter;
        this.password = "";
        this.random = new Random();
        
        while (this.i < this.length){
            randomLetter = sampleBase.charAt(this.random.nextInt(26));
            this.password = this.password + randomLetter;
            i++;
        }
        // write code that returns a randomized password
        i = 0;
        return this.password;
    }
}
