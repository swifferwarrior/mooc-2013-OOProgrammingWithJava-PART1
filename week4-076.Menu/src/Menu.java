
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    //add the methods here
    
    public void addMeal(String meal) {
        //76.1
        //adds a new meal to the list this.meals of a Menu object
        //should not be added if already in the list
        if(this.meals.contains(meal)){
            System.out.println("Already added!");
        } else {
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        //76.2
        //prints meals in a menu
        for( String meal : this.meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        //76.3
        //clears a menu
        meals.clear();
    }
}
