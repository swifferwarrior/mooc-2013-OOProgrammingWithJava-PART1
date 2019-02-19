import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        Integer sum = 0;
        
        for (Integer add : list){
            sum = sum + add;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        Integer nCount = list.size();
        
        double average = sum / nCount;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        int nCount = list.size();
        double numerator = 0;
        double denominator= nCount - 1;
        
        for (double entry : list){
            double entrySquared = (entry-avg)*(entry-avg);
            numerator = numerator + entrySquared;       
        }
        
        double variance = numerator/denominator;
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
