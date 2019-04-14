
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.library.add(newBook);
    }

    public void printBooks() {
        for (Book book : this.library) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> foundTitles = new ArrayList<Book>();
        
        for (Book book : this.library){
            /*if (book.title().contains(title)){*/
            if(StringUtils.included(book.title(), title)){
                foundTitles.add(book);
            }
        }
        return foundTitles;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> foundPublishers = new ArrayList<Book>();
        
        for (Book book : this.library){
            /*if (book.publisher().contains(publisher)){*/
            if(StringUtils.included(book.publisher(), publisher)){
                foundPublishers.add(book);
            }
        }
        return foundPublishers;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> foundYear = new ArrayList<Book>();
        
        for (Book book : this.library){
            if (book.year() == year){
                foundYear.add(book);
            }
        }
        return foundYear;
    }
    
}


/* POST-SUBMIT NOTES */ 
/*
1. ARRAYS VS ARRAYLIST
        First attempted to use an array. However, arrays are meant to be finite
        and the number of cells is defined before adding to it. An arraylist can
        accomodate for an indefinite number of objects.
2. FOR() LOOPS
        In an array, since there are a finite number of cells, you would need
        an instance loop ( i = 0; i < array.length, i++). Since this class is an
        arraylist, no need to use an instance variable. Can use the for loop
        for ( Book book : this.library)

3. SEARCHING FUNCTION
        When comparing Strings for a search function, the getter method (i.e.
        publisher() can call its own method. Example: book.publisher().contains();

        For years, it would probably be better to have the exact year, so == does
        just fine.
*/
