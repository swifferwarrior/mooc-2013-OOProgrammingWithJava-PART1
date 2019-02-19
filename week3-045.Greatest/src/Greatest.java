
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greaterFirst, greatest = 0;
        
        if(number1 > number2){
            greaterFirst = number1;
        } else {
            greaterFirst = number2;
        }
        
        if (greaterFirst > number3){
            greatest = greaterFirst;
        } else {
            greatest = number3;
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}

