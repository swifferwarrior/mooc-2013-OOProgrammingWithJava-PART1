
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {

        int smallest = array[0];
        for (int number : array) {
            if (smallest >= number) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        int smallestIndex = 0;

        for (int number : array) {
            if (number == smallest) {
                break;
            } else {
                smallestIndex++;
            }
        }

        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int[] newArray = new int[array.length - index];
        int i = index;
        int j = 0;
        int newIndexFromTheSmallest;

        while (i < array.length) {
            for (int number : newArray) {
                newArray[j] = array[i];
                //System.out.println(newArray[j]);       
                //To test that array items were copied over
                i++;
                j++;
            }
        }
        newIndexFromTheSmallest = indexOfTheSmallest(newArray) + index;
        //You are wanting to know the index of array, not index of newArray

        return newIndexFromTheSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int first = index2;
        int second = index1;
        int firstValue = array[index1];
        int secondValue = array[index2];

        array[first] = firstValue;
        array[second] = secondValue;
    }

    public static void sort(int[] array) {
        int smallest = smallest(array);
        int smallestIndex = indexOfTheSmallest(array);

        System.out.println(Arrays.toString(array));
        
        swap(array, 0, smallestIndex);

        for (int i = 1; i < array.length; i++) {
            smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}

/* POST-SUBMIT NOTES */
 /*
1. indexOfSmallest() FROM NEW STARTING POINT
        Array cells can't be changed, but their states can. Created a newArray
        that only contained the range between "specified index" and the end of the
        array. However, that specified index in Array becomes the index[0] in
        the newArray.
2. sort() METHOD
        I probably could have made i=0 and skip indexOfTheSmallest()...

3. swap() METHOD
        In order for it to work, both the indexes and values of both items need
        to be stored in variables within the method.
 */
