package question9;

public class Section9 {
	// Method to check to see if the sum of all the inegers in the array is greater than 100
    public static boolean isSumGreaterThan100(int[] numbers) {
    	
    // Placeholder for sum
        int sum = 0;
    // Loop to return wether or not sum is greater than 100
        for (int num : numbers) {
            sum += num;
        }
        return sum > 100;
    }
    // Main method declaring two example integer arrays and then testing out our previous method.
    public static void main(String[] args) {
        int[] example1 = {20, 30, 25, 15, 12};
        int[] example2 = {10, 20, 30, 25, 15};
    // Prints out the results for our mortal eyes to view
        System.out.println(isSumGreaterThan100(example1));
        System.out.println(isSumGreaterThan100(example2));
    }
}
