public class Person {
    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Person() {
        this.name = "";
        this.number = "";
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String toString() {
        return this.name + "  number: " + this.number; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void changeNumber(String newNumber){
        this.number = newNumber;
    }
}
