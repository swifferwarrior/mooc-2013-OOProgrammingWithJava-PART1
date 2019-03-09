
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        String name;
        String studentNumber;
        String searchTerm;

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        
        //Loop for making list of name-number-pairs
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();

            if (name.equals("")) {
                break;

            } else {
                System.out.print("number: ");
                studentNumber = reader.nextLine();

                list.add(new Student(name, studentNumber));
            }
        }

        //Prints list after done with entries
        System.out.println("");

        for (Student entry : list) {
            System.out.println(entry);
        }

        //Search 
        System.out.println("");
        System.out.print("Give search term: ");
        searchTerm = reader.nextLine();
        System.out.println("Result: ");

        for (Student entry : list) {
            String referencedName = entry.getName();
            if (referencedName.contains(searchTerm)) {
                System.out.println(entry);
            }
        }
    }
}
