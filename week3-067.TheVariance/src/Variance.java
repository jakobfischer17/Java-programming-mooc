 
import java.util.ArrayList;
 
public class Variance {
 
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        for (int item : list) {
            i = i + item;
        }
        return i;
    }
 
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = sum(list) / (double) list.size();
        return average;
    }
 
    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        double variance = 0;
        for (int item : list) {
            variance = variance + Math.pow((item - average), 2);
        }
        return variance / (list.size() - 1);
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