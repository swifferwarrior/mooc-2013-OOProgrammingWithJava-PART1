
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int number,first,second;
        
        System.out.println("First: ");
            first = Integer.parseInt(reader.nextLine());
            number = first;
        System.out.println("Second: ");
            second = Integer.parseInt(reader.nextLine());
            
        while(number <= second){
            System.out.println(number);
            number++;
        }
    }
}
