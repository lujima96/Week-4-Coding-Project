package question_13;

import java.util.Arrays;

public class Section13 {
	// Creating method to calculate the median of an array of doubles
    public static double calculateMedian(double[] numbers) {
    // Int to hold a sorted copy of the original double array
        double[] sorted = numbers.clone();
    // Operation to sort the double array.
        Arrays.sort(sorted);
    // Int to hold length of the array
        int length = sorted.length;
    // Checking the length of the array to determine which approach to use to calculate the median.
    // If the number of elements in the array is odd the number in the center will be the median
    // If the number of elements in the array is even the two centermost numbers must be combined and averaged
    // o determine the median
        if (length % 2 != 0) {
            return sorted[length / 2];
        } else {
            return (sorted[(length / 2) - 1] + sorted[length / 2]) / 2.0;
        }
    }
// Main method to test out all of our hard work
    public static void main(String[] args) {
    	//Creating some test arrays
        double[] example1 = {3.5, 2.1, 5.6, 4.3, 1.2};
        double[] example2 = {10.0, 20.0, 30.0, 40.0};
        double[] example3 = {7.0};

        System.out.println(calculateMedian(example1));
        System.out.println(calculateMedian(example2)); 
        System.out.println(calculateMedian(example3));
    }
}
