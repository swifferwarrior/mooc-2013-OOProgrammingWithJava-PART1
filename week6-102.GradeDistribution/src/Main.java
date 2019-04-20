
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //INSTRUCTIONS
            // do not put all to one method/class but rather design a proper structure to your program
            // Your program should use only one Scanner object, i.e., it is allowed to call 
            // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        //1. Initialize
        Scanner lukija = new Scanner(System.in);
        Course course = new Course(lukija);
        
        //2. Enter in exam scores
        System.out.println("Type exam scores, -1 completes:");
        course.collectScores(lukija);
        
        //3. Sort scores
        course.sortScores();
        
        //4. PROFIT
        course.printScores();

}
}
