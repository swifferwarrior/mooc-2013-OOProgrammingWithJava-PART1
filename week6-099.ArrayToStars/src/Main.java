
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // prints a line with stars for each number in the array
        for (int i = 0; i < array.length; i++){
            int number = array[i];
            
            for (int j = 0; j < number; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        /* Spaghetti example
        for (int i = 0; i < array.length ;i++){
            int number = array[i];
            for (int j = 1; j<=number-1 ;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }*/
    }
}

/* POST-SUBMIT NOTES */
/*
1. Unnecessary index manimulation
        In the nested for(j) loop, the output had an extra 2 *'s per line
        It was counteracted by making j=1 and subtracting 1 from "int number".
        This can be prevented by making 'j < number' instead of 'j <= number'
        AND sout() instead of sout("*")
*/