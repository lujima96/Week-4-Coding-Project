package question8;

public class Section8 {
	// Method that takes two seperate names and creates a full name
    public static String getFullName(String firstName, String lastName) {
    // Returns the results
        return firstName + " " + lastName;
    }
    // Main method to print out our desired result
    public static void main(String[] args) {
        String fullName = getFullName("Lucas", "Mason");
        System.out.println(fullName);
    }
}
