package question_11;

public class Section11 {
	// Method to return which array contains a higher average
    public static boolean isFirstAverageGreater(double[] firstArray, double[] secondArray) {
        return calculateAverage(firstArray) > calculateAverage(secondArray);
    }
    // Method to calculate average of an array of type double
    private static double calculateAverage(double[] array) {
    	// Placeholder for sum
        double sum = 0.0;
        // Loop to create sums to be used for averaging
        for (double num : array) {
            sum += num;
        }
        // Divides sum by number of elements to give average
        return sum / array.length;
    }
    	// Main method containing 2 example arrays and print statements to view the outputs.
    public static void main(String[] args) {
        double[] array1 = {10.0, 20.0, 30.0};
        double[] array2 = {15.0, 25.0, 35.0};

        System.out.println(isFirstAverageGreater(array1, array2)); 

        double[] array3 = {40.0, 50.0, 60.0};
        System.out.println(isFirstAverageGreater(array3, array2)); 
    }
}
