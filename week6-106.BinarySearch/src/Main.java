
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] taulukko = {-3, 2, 3, 4, 7, 8, 12};
        
        Scanner lukija = new Scanner(System.in);
        //Arrays.sort(taulukko);

        System.out.print("Numbers in the array " + Arrays.toString(taulukko));
        System.out.println();

        System.out.print("Enter searched number: ");
        String etsittavaLuku = lukija.nextLine();
        System.out.println();

        boolean tulos = BinarySearch.search(taulukko, Integer.parseInt(etsittavaLuku));

        // Print here the result
        if (tulos) {
            System.out.println("Value " + etsittavaLuku + " is in the array");
        } else {
            System.out.println("Value " + etsittavaLuku + " is not in the array");

        }
    }
}
/* POST-SUBMIT NOTES */
/*
1. SORT THE ARRAY
        The values in the array appear to be in order already, but for some reason
        it will time out unless you sort it first...why? Reddit states that it's 
        possibly as a precaution if a new, out-of-order entry was made into the 
        array. But it doesn't quite explain why omitting a sort() method would
        ADD to the runtime.
*/

