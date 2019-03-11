/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spoon
 */
public class Player {
    private String name;
    private int goals;

    //CONSTRUCTOR(s)
    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public Player(String name) {
        this(name, 0);
    }
    

    //METHODS
    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    public String toString() {
        return "Player: " + this.name + ", goals " + this.goals;
    }
}

/* POST-SUBMIT NOTES */
/*
1. Overloading constructors. Simpler constructors should pull from the more defined
    constructor. Ex. Player(name) shoulc pull from player(name, goals)
    See: Ln 16-23

2. Trying to figure out where the toString is explicitly called, but it is not.
    Somehow it is being called implicitly. 
    Reason: https://chortle.ccsu.edu/java5/Notes/chap27/ch27_10.html
*/