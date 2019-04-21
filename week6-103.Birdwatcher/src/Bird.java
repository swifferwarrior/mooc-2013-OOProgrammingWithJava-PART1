import java.util.Scanner;

public class Bird {
    private String name;
    private String nameLatin;
    private int observations;

    //CONSTRUCTORS
    public Bird(String name, String nameLatin, int observations) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = observations;
    }
    
    public Bird(){
        this("unknown", "unknown", 0);
    }
    
    //METHODS
    public String addName(String input){
        this.name = input;
        
        return this.name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String addLatinName (String input){
        this.nameLatin = input;
        
        return this.nameLatin;
    }
    
    public String getLatinName(){
        return this.nameLatin;
    }
    
    public void observation(){
        this.observations++;
    }
    
    public void observation(int times){
        this.observations = times;
    }
    
    public int getObservations(){
        return this.observations;
    }
    
    public void show(Bird bird){
        System.out.println(bird);
    }

    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.observations + " observations";
    }
    
    
    
    
}
