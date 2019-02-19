import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        
        Scanner reader = new Scanner(System.in);
        
        //Declared integers before you get to work.
        int sum = 0;
        int howMany = 0;
        int even = 0;
        int odd = 0;
        
        //Start the p
        System.out.println("Type numbers: ");
    
        while(true){
            int number = Integer.parseInt(reader.nextLine());
            
            if (number == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum); //36.2
                System.out.println("How many numbers: " + howMany); //36.3
                System.out.println("Average: " + ((double)sum / howMany)); //36.4
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            } else  // 36.2
                if ((number % 2) == 0){
                    even++;
                } else {
                    odd++;
                }
                sum = sum + number;
                howMany++; //36.3
            }
        }
        
        
    }

