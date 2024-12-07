package question2;

public class Section2 {
	public static String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	public static void main(String[] args) {
		// Part A. Creating the array of names
		
		// Variable for total letters
		int totalLetters = 0;
		// Enhanced for loop to find the total number of letters across all names
		for (String name : names) {
			totalLetters += name.length();
		}
		// Divide the total letters by the number of entries
		double average = (double) totalLetters / names.length;
		// Print out the value
		System.out.println("Average number of letters per name: " + average);
		
		// Part B. Concatenating all names seperated by spaces
		String combinedNames = "";
		for (String name : names) {
			combinedNames += name + " ";
		}
	
		// Outputs the combined array of names.
		System.out.println("Concatenated Names: " + combinedNames);
		

	}

}
