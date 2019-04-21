import java.util.ArrayList;
//import java.util.Scanner;

public class Database {
    private ArrayList<Bird> birdDatabase;

    public Database() {
    this.birdDatabase = new ArrayList<Bird>();
    }
    
    public void add(String name, String latinName, int observations){
        Bird bird = new Bird(name,latinName,0);
        this.birdDatabase.add(bird);
    }
    
    public void add(Bird bird){
        this.birdDatabase.add(bird);
    }
    
    public void observation(String query){
        for (Bird bird : this.birdDatabase){
            if (bird.getName().contains(query)){
                bird.observation();
            }
        }
    }
    
    public void statistics(){
        for (Bird bird : this.birdDatabase){
            System.out.println(bird);
        }
    }
    
    public void show(String query){
        for (Bird bird : this.birdDatabase){
            if (bird.getName().contains(query)){
                System.out.println(bird);
            }
        }
    }
}
