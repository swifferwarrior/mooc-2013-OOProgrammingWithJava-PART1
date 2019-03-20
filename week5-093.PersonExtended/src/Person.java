import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private MyDate currentDate = new MyDate(
            (Calendar.getInstance().get(Calendar.DATE)),
            (Calendar.getInstance().get(Calendar.MONTH) + 1),
            (Calendar.getInstance().get(Calendar.YEAR))
    );
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        this.name = name;
        this.birthday = currentDate;
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        // (current total days) - (birthday total days)
        int age = 0;
        /*MyDate currentDate = new MyDate(
            (Calendar.getInstance().get(Calendar.DATE)),
            (Calendar.getInstance().get(Calendar.MONTH) + 1),
            (Calendar.getInstance().get(Calendar.YEAR))
        );*/
        
        age = this.birthday.differenceInYears(currentDate);
        
        return age;
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        //compares the ages of thh object for which the method is called and
        //the object is given as parameter.
        //The mothod returns true if the object itself is older than the parameter.
        
        if(this.birthday.earlier(compared.birthday)){
            return true;
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}

/* POST-SUBMIT NOTES*/
/*
1. "WHY ARE THE AGES 5 YEARS OLDER THAN EXPECTED?!"
        The expected output in the exercise is from 2013. It is currently the year 2019 (roughly 5 years)
        My current age is correct in the main class test.
2. olderThan(Person compared) method
        Date comparisons are already included in the MyDate class. This makes things WAY easier.
3. OVERLOADED CONSTRUCTORS FOR CURRENT DATE
        I kept on creating a new "MyDate currentDate = new MyDate" for each instance 
        that called for the current date. I simplified it by making a single private variable
        to call on. I'll know if it's called if the variable name is green without "this." 
        preceding it.
*/
