package question_10;

public class Section10 {
	// Method
    public static double calculateAverage(double[] numbers) {
    	// Placeholder for sum
        double sum = 0.0;
        //Loop to find the sum of the numbers in the array given.
        for (double num : numbers) {
            sum += num;
        }
        // Returns the result of sum divided by the amount of numbers in the array
        // thus giving us an average
        return sum / numbers.length;
    }
    	// Main method to use our method
    public static void main(String[] args) {
    	//Creating two example arrays to test the method
        double[] example1 = {10.5, 20.0, 30.5, 40.0};
        double[] example2 = {5.0, 15.5, 25.0};
        //Making the sweet results viewable.
        System.out.println(calculateAverage(example1)); 
        System.out.println(calculateAverage(example2)); 
    }
}
