
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));

    }

    public static int[] copy(int[] array) {
        //creates a copy of the parameter
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        //creates an array which contains the elements of the parameter
        //but in reversed order
        int[] reverseCopy = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            reverseCopy[i] = array[(array.length-i)-1];
        }
        
        return reverseCopy;
    }
}

/* POST-SUBMIT NOTES */
/*
1. Copying an array
    For "new int[parameter]" the parameter is the array length. Values have to be
    entered in individually, so use a for() loop.
2. Reversing the copy
    Use the same for() loop as in the copy() method. However, the parameter for
    the array[] should be it's length-i. As the reverseCopy's index advances forward
    the array[] index will shrink.
2.1 One moooooore ting!
    array.length gives a real number, not an index (e.g. 4 items, not index=3)
    so subtract 1 from the array-length.
    
*/
