
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        //finish the method into a real binary search
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            //System.out.println(beginning + ", " + middle + ", " + end);       Prints out the variables for each loop.
            if (array[middle] == searchedValue) {
                //System.out.println("Value " + searchedValue + " is in the array");
                return true;
            }

            // restrict the search area 
            if (middle == (array.length - 2)) {
                if (array[array.length - 1] == searchedValue) {
                    //System.out.println("Value " + searchedValue + " is in the array");
                    return true;
                }
            }

            if (searchedValue > array[middle]) {
                beginning = middle + 1;
            } else if (searchedValue < array[middle]) {
                end = middle;
            }

            if (end == beginning && array[middle] != searchedValue) {
                break;
            }
        }

        //System.out.println("Value " + searchedValue + " is not in the array");
        return false;
    }
}

/* POST-SUBMIT NOTES */
 /*
1. HOW TO DETECT LAST INDEX IN THE ARRAY
        If the middle is found by averaging, then the answer is always rounded
        down and it won't report the last index as in the array. This is fixed by
        stating that if the middle equals the second to last index, check if the 
        last index matches the searched value before anything else.
2. DON'T PRINT IN THIS CLASS
        Pring in the main class.
 */
