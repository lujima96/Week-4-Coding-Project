package question1;

public class Section1 {

	public static void main(String[] args) {
// 1. Creating the first array of age information
		int[] ages1 = {3, 9, 23, 64, 2, 8, 29, 93};
		
// 2.  Calculating and showing the range of the first array
		int range1 = calculateRanges(ages1);
		System.out.println("The range of ages in ages1 is " + range1 + ".");
		
// 3. Creating a second array of ages with a different length
		int[] ages2 = {5, 12, 27, 45, 30, 16, 50, 78, 102};
		
// 4. Calculating and showing the range of the second array
		
		int range2 = calculateRanges(ages2);
		System.out.println("The range of ages in ages1 is " + range2 + "." );
		
// 5. Creating a third array with a different length from the first two 
		
		int[] ages3 = {18, 22, 35, 40};
// 6. Calculating and displaying the range of the third array.
		int range3 = calculateRanges(ages3);
		System.out.println("The range of ages in ages3 is " + range3 + ".");
// 7. Using a loop to calculate the average age in each list
		int average1 = calculateAverage(ages1);
		int average2 = calculateAverage(ages2);
		int average3 = calculateAverage(ages3);
// 8. Prining the new averages to console.
		System.out.println("The average of ages in ages1 is " + average1 + "." );
		System.out.println("The average of ages in ages2 is " + average2 + ".");
		System.out.println("The average of ages in ages3 is " + average3 + ".");
		
	}
	
/*
 * Method to calculate the range of ages in an array.
 * Range is the difference between the first and last element in the array.
 * 
 * Parameter: Array of ages
 * Return: Range of ages
 * 
 * The method proves that index values are dynamic and work for arrays of different length.
 */
	public static int calculateRanges(int[] ages) {
		int firstAge = ages[0];
		int lastAge = ages[ages.length - 1];
		return lastAge - firstAge;
	}
/*
* This method takes the information gained from the array of integers ages and then
* calculates the average by dividing the total sum of all numbers by the amount of numbers
* contained within the list.
* 
* Parameter: Array of ages
* Return: Average age
*/
		public static int calculateAverage(int[] ages) {
			int sum = 0;
			for (int age : ages) {
				sum += age;
			}
			return (int) sum / ages.length;
		
	}
	


}
