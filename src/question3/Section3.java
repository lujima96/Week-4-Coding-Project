package question3;

public class Section3 {

	public static void main(String[] args) {
		// Creates an array of pickup trucks
		String[] trucks = {"silverado", "f150", "sierra", "ram", "tacoma"};
		// Accesses the last element of the array by looking at the number of elements
		// and subtracting 1 to account for 0 based indexing
		String lastTruck = trucks[trucks.length - 1];
		// Prints result to console
		System.out.println("The last truck in trucks is : " + lastTruck);

	}

}
