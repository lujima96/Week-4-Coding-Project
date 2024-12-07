package question7;

public class Section7 {
	// Method that takes a word and returns the word attached to itself x numbers of times
    public static String concatWord(String word, int n) {
    // Declares a magical stringbuilder
        StringBuilder sb = new StringBuilder();
    // Loop to add assemble the stringbuilder
        for(int i = 0; i < n; i++) {
            sb.append(word);
        }
    // Returns the stringbuilder as a string so we can actually use it
        return sb.toString();
    }
    //Main method to output our concatenated word
    public static void main(String[] args) {
        String result = concatWord("Hello", 3);
        System.out.println(result); 
    }
}
