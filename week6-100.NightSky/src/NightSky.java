
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public void printLine() {
        //Prints one line of stars
        /*Line length is determined by the value of 'width' and
            'density' determines the star probability. For each
            printed character, use a 'random' object to decide if
            it prints out as a white space or a star.
         */

        for (int j = 0; j < this.width; j++) {
            Random random = new Random();
            double randomNumber = random.nextDouble();

            if (randomNumber <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println();
        }
    }
    
    public int starsInLastPrint(){
        //returns the nuber of stars printed in the previous night sky
        return this.starsInLastPrint;
    }

}

/*
    public double nextDouble(){
        //resets density for each line?
        Random randomizer = new Random();
        double newDensity = randomizer.nextDouble();
        return newDensity;
    }
 */

/* POST-SUBMIT NOTES */ 
/*
1. SUCCESS!
        https://www.youtube.com/watch?v=SLuW-GBaJ8k
        Richard Strauss - Also Sprach Zarathustra

2. printLine()
        Made new random object and created a random double object.

3. print()
        In order to refresh the starsInTheSky count every iteration of print()
        you must put in 'this.starsInLastPrint = 0;' outside of the for () loop
*/
