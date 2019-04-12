
import java.util.Scanner;
import java.util.ArrayList;

public class Application {

    public void print(int upTo) {
        for(int i = 1; i <= upTo; i++) {
            printMultiplicationTableRow(i, upTo);

            System.out.println();
        }
    }

    public void printMultiplicationTableRow(int multiplier, int howManyTimes) {
        for(int i = 1; i <= howManyTimes; i++) {
            System.out.print(i * multiplier + " ");
        }
    }
    }
