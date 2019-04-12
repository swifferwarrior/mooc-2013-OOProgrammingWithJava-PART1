
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Prints the numbers in the array on the same row
        //All nubers should be separated with comma and whitespace and there
        int indexZero = array[0];
        String elegant = Integer.toString(indexZero);
        
        for ( int i = 1; i < array.length; i++){
            elegant += ", " + array[i];
        }
        System.out.println(elegant);
        //should not be a comma trailing the last number.
    }
}
/*POST-SUBMIT NOTES*/
/*
1. Avoiding Trailing Commas
    The base String (elegant) could be defined as array[0] instead of "" so that
    instead of concatenating a number followed by ", " you can preface with ", "
    followed by a number. Once the list ends, a comma will not trail behind it.
1.1 Avoiding Trailing Commas (even better!)
    Instead of creating "int indexZero", prevent the last comma with
    "if (i < (array.length-1))" Prevents garbage code?
*/
