
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Database birds = new Database();

        while (true) {
            System.out.print("? ");
            String command = input.nextLine();

            //MENU
            if (command.equals("Add")) {
                //Adds a bird, yo
                System.out.print("Name: ");
                String name = input.nextLine();

                System.out.print("Latin Name: ");
                String nameLatin = input.nextLine();

                birds.add(new Bird(name, nameLatin, 0));
            }

            if (command.equals("Observation")) {
                //Increases observation # of specific bird by 1
                System.out.print("What was observed:? ");
                String observedBird = input.nextLine();
                birds.observation(observedBird);

                //search for Bird bird containing whichBird
            }

            if (command.equals("Statistics")) {
                //Print all birds
                birds.statistics();
            }

            if (command.equals("Show")) {
                //Prints specific bird
                System.out.print("What? ");
                String showBird = input.nextLine();
                birds.show(showBird);
            }

            if (command.equals("Quit")) {
                //Fine, be that way.
                break;
            }
        }
    }
}

/* POST-SUBMIT NOTES */
/*
1. USER INPUT
        User input was stored into variables on the Main method. No need for Scanner
        on the other classes.

2. MENU ITEMS
        The menu items (Add, observation, statistics, etc.) worked by gathering input  
        then storing them in variables. The variables were then used in Database.methods()

3. BIRD VS DATABASE CLASSES
        The Bird class only dealt with altering or accessing the Bird object state. The 
        Database class dealt with how the Bird objects were handled.
*/
