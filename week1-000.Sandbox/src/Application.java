import java.util.Scanner;
import java.util.ArrayList;

public class Application {
    public static void print(ArrayList<String> list) {
        for (String word : list){
                System.out.println(word);
        }
    }
    
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("C++");
        
        print(list);
}
}