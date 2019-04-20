
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    
    //pvt List and average
    private ArrayList<Integer> gradeList = new ArrayList<Integer>();
    private double passingTally;
    private double totalTally;
    private double percentage;

    //pvt Distribution
    private int five;
    private int four;
    private int three;
    private int two;
    private int one;
    private int zero;

    public Course(Scanner input) {
        //[constructor] Average and list
        this.gradeList = new ArrayList<Integer>();
        this.passingTally = 0;
        this.totalTally = 0;
        this.percentage = 0;
        
        //[constructor] Distribution
        this.five = 0;
        this.four = 0;
        this.three = 0;
        this.two = 0;
        this.one = 0;
        this.zero = 0;
    }

    public void collectScores(Scanner input) {
        while (true) {
            int score = Integer.parseInt(input.nextLine());

            if (score == -1) {
                break;
            } else if(score >= 0 && score <= 60) {
                this.gradeList.add(score);
            }

        }
    }

    public void sortScores() {
        for (int score : this.gradeList) {
            if (score >= 50) {
                this.five++;
                passingTally();
            } else if (score >= 45) {
                this.four++;
                passingTally();
            } else if (score >= 40) {
                this.three++;
                passingTally();
            } else if (score >= 35) {
                this.two++;
                passingTally();
            } else if (score >= 30) {
                this.one++;
                passingTally();
            } else {
                this.zero++;
                totalTally();
            }
        }
    }

    public String addStar(int tally) {
        String starTally = "";

        for (int i = tally; i > 0; i--) {
            starTally += "*";
        }
        return starTally;
    }

    public void passingTally() {
        this.passingTally++;
        this.totalTally();
    }

    public void totalTally() {
        this.totalTally++;
    }

    public double percentage() {
        if (this.totalTally > 0) {
            this.percentage = (this.passingTally / this.totalTally) * 100;
        }

        return this.percentage;
    }

    public void printScores() {
        for (int score : this.gradeList) {
            System.out.println("Grade distribution:");
            
            System.out.print("5: ");
            System.out.println(addStar(this.five));
            
            System.out.print("4: ");
            System.out.println(addStar(this.four));
            
            System.out.print("3: ");
            System.out.println(addStar(this.three));
            
            System.out.print("2: ");
            System.out.println(addStar(this.two));
            
            System.out.print("1: ");
            System.out.println(addStar(this.one));
            
            System.out.print("0: ");
            System.out.println(addStar(this.zero));
            
            percentage();

            System.out.println("Acceptance Percentage: " + this.percentage);
        }
    }
}

/* POST-SUBMIT NOTES */

/*
1. USING SCANNER INPUT ACROSS CLASSES
        Imported java.util.Scanner in both classes then I initialized a scanner
        object in Main.java. To transfer input from Main, I entered in 
        (Scanner input) as a parameter for the constructor. It was also needed
        for the collectScores() method.

2. TRACKING TALLIES
        Tallies were made upon sorting and stored as integers. This made it more
        versatiles so it wasn't baked into a String until needed. The addStar()
        method converted the tally number into a String.

3. TOO MANY CLASSES!
        First, I attempted to make a Tally class, Distribution class, and Course class.
        However, tallies and distro could be handled within the Course since it's
        within reason to assume that distro and tallying will be done the same
        way every time. It allows all the data to be housed in the same class
        and used as is rather than risk having the wrong object being called across
        classes.

4. SPLITTING UP STEPS
        Made sure to distinguish gathering input, sorting, and printing with
        separate methods.

5. RATIONALE FOR ArrayList<> VS Array[]
        The example solution uses an Array[] but I had opted to use an ArrayList<>
        since otherwise it would only be useful for courses with only six students.
        ArrayList allowed it to accept more students later.
*/





/* Spaghetti

    pvt Grades List
    private ArrayList<Integer> gradeList = new ArrayList<Integer>();
    private Scanner lukija = new Scanner(System.in);
    private int grade;
    //private GradeDistribution distro = new GradeDistribution();
    
    //pvt Distro
    private String zero;
    private String one;
    private String two;
    private String three;
    private String four;
    private String five;
    
    //pvt Avg
    private int passingTally;
    private int totalTally;
    private double percentage;


    public Course() {
        this.gradeList = new ArrayList<Integer>();
        this.grade = Integer.parseInt(lukija.nextLine());
        //this.distro = new GradeDistribution();
        
        //this.Distro
        this.zero   = "0: ";
        this.one    = "1: ";
        this.two    = "2: ";
        this.three  = "3: ";
        this.four   = "4: ";
        this.five   = "5: ";
        
        //this.Avg
        this.passingTally = 0;
        this.totalTally = 0;
        this.percentage = 0;
    }
    
    //ArrayList Methods
    public void addScore(int score) {
       // while (true) {
            if (score >= 0 && score <= 60) {
                /*if (score == -1) {
                    break;
                //} else {
                    this.gradeList.add(score);
                //}
            //}else {
                //break;
            }
        //}
    }

    public void outOfRange() {
        System.out.println("Score out of range. Not recorded.");
    }
    
    //Distro methods
    public void sort(){
        for(int grade : this.gradeList){
            if (grade >= 50){
                addStar(this.five);
                passingTally();
            } else if (grade >= 45){
                addStar(this.four);
                passingTally();
            } else if (grade >= 40){
                addStar(this.three);
                passingTally();
            } else if (grade >= 35){
                addStar(this.two);
                passingTally();
            } else if (grade >= 30){
                addStar(this.one);
                passingTally();
            } else {
                addStar(this.zero);
                totalTally();
            }
        }
    }
    
    public void printDistribution(){
        System.out.println("Grade distribution:");
        System.out.println(this.five);
        System.out.println(this.four);
        System.out.println(this.three);
        System.out.println(this.two);
        System.out.println(this.one);
        System.out.println(this.zero);
        System.out.println(percentage());
    }
    
    public double percentage(){
        System.out.println("Acceptance percentage:");
        if (this.totalTally < 0){
            this.percentage = (this.passingTally/this.totalTally)*100;
        }
        
        return this.percentage;
    } 
    
    //Tally Avg methods
    public String addStar(String numberGrade){
        numberGrade += "*";
        return numberGrade;
    }
    
    public String getStarTally(String numberGrade){
        return numberGrade;
    }
    
    public void passingTally(){
        this.passingTally++;
        this.totalTally();
    }
    
    public void totalTally(){
        this.totalTally++;
    }
    
    public int getPassingTally(){
        return this.passingTally;
    }
    
    
    /*public void sortScores(){
        for (int score : this.course){
            this.distro.sort(score);
        }
    }
    
    public double getPercentage(){
        return this.distro.percentage();
    }
    
    public void getDistribution(){
        this.distro.printDistribution();
    }
    
    public void getList(){
        for (int score : this.course){
            System.out.println(score);
        }
    }*/

 /* public boolean rangeCheck(int score){
        if (score >= -1 || score <= 60){
            return true;
        } else {
            return false;
        }  
    }*/
