package question5_question6;
// imports existing list from previous question package
import question2.Section2;

public class Section5and6 {
    public static void main(String[] args) {
    	// creates an array of names
        String[] names = Section2.names;
        // Variable containing the sum of the lengths of each name present within the array.
        int[] nameLengths = new int[names.length];
        // For loop to find the sum of lengths
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        // Variable to hold that sum
        int sum = 0;
        // Loop to iterate over the nameLengths array and calculate the sum of the elements
        for (int length : nameLengths) {
            sum += length;
        }
        // Prints it all out for our viewing pleasure
        System.out.println(sum);
    }
}
