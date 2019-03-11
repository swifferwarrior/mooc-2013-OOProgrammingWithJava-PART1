/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spoon
 */
import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();

    //CONSTRUCTORS
    public Team(String name, int maxSize) {
        this.name = name;
        this.maxSize = maxSize;
    }
    
    public Team(String name){
        this(name, 16);
    }

    //METHODS
    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player){
        //adds a player to the team array
        this.players.add(player);
    }
    
    public void printPlayers(){
        //prints the players in the team
        for ( Player player : this.players){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        //sets the max number of players that the team can have
        this.maxSize = maxSize;
    }
    
    public int size(){
        //returns number of players in the team
        int numberOfPlayers = 0;
        
        if (this.maxSize<this.players.size()){
            return this.maxSize;
        } else {
            for ( Player player : this.players){
                numberOfPlayers++;
            }
        }
        return numberOfPlayers;
    }
    
    public int goals(){
        //returns the total number of goals for all players in the team
        int totalGoals = 0;
        
        for ( Player player : this.players){
            totalGoals += player.goals();
        }
        
        return totalGoals;
    }
    
}

/* POST-SUBMIT NOTES */
/*
1. ArrayList
    Attempted to add ArrayList for the addPlayer() method but forgot to import with
    "import java.til.ArrayList for this specific class.

    1.1 Privately initialized the ArrayList in the class but forgot to add :
        " = new ArrayList<Player>()"
2. size()
    When calling size(), "this." wasn't added to the front of the specific array
    so all the players from all arrays were counted.
*/
