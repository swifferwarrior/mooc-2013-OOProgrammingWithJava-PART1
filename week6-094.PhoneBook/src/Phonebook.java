
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phoneBook;

    //CONSTRUCTOR
    public Phonebook() {
        this.phoneBook = new ArrayList<Person>();
    }

    //METHODS
    public void add(String name, String number) {
        //creates a person object and adds it to the ArrayList
        this.phoneBook.add(new Person(name, number));
    }

    public void printAll() {
        //prints all the persons inside the phonebook
        for (Person contact : this.phoneBook) {
            System.out.println(contact);
        }
    }

    public String searchNumber(String name) {
        //returns the phone number corresponding to the given name
        //if the sought person is not known the string "number not known"
        for (Person contact : this.phoneBook) {
            if (contact.getName().equals(name)) {
                return contact.getNumber();
            }
        }
        return "number not known";
    }
}

/* POST-SUBMIT NOTES */
/*
1. WEIRD ERROR
    the add() method was counting "String number" as a MyDate object. WTF? Turns
    out that I accidentally created the Phonebook class in the wrong project.
2. OBJECT WITHIN OBJECT
    Within the searchNumber() method, the contact object is not a String. you have
    to return the "String 'name'" from within the "contact" object.
*/
