
public class Reformatory {

    //private int weight;
    private int totalWeightMeasured;

    public Reformatory() {
    //    this.weight = 0;
        this.totalWeightMeasured = 0;
    }
    
    public int weight(Person person) {
       // this.weight = person.getWeight();
       /* This is redundant because I didn't need to instantiate "int weight".
            I wasn't going to do anything with it in any of the following methods.
       */
        this.totalWeightMeasured++;

        return person.getWeight();
    }

    public void feed(Person person) {
        //person.weight = person.setWeight(this.weight+1); 
        //      this doesn't work because person.weight is an integer variable
        person.setWeight(person.getWeight() + 1);
        //      setWeight() works because it's a method, not a variable
    }

    public int totalWeightsMeasured() {
        
        return this.totalWeightMeasured;
    }
}
