
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        //returns the sum of the numbers int he array given as a parameter
        //output should be 15
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

/* POST-SUBMIT NOTES*/
/*
1. for(condition)
    Never specify a defined index in the for(condition). Arrays are dynamic. Use
    array.length instead.
*/
