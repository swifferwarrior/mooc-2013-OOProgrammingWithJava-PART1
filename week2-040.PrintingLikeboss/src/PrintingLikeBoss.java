public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here

    public static void printStars(int amount) {
        int i = 0;
        
        while(i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        
        while(i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int iSpace = size - 1;
        
        while(i <= size){ //left side and center of tree
            printWhitespaces(iSpace);
            printStars(i);
            i++;
            iSpace--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int s = 1; // s = stars added eash level
        int i = 0;
        int iSpace = height - 1;
        
        while(i < height){
            printWhitespaces(iSpace);
            printStars(s);
            s+= 2; //adds one star on each side
            i++;
            iSpace--;
        }
        //make this match up with line 2 of the tree
        //you you want it to line up with peak -1
        s=3;
        printWhitespaces(height - 2);
        printStars(s);
        printWhitespaces(height - 2);
        printStars(s);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        //printStars(5);
        //    printStars(2);
        printTriangle(5);
            printTriangle(7);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
