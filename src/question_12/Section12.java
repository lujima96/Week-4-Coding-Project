package question_12;

public class Section12 {
	//Method to see if the proper conditions are met to buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	//returns whether it is hot outside AND if the money on hand is greater than $10.50 
        return isHotOutside && moneyInPocket > 10.50;
    }
    //Main method that tests out our method with some test parameters
    //Param 1 is isHotOutside and param 2 is moneyInPocket
    public static void main(String[] args) {
        System.out.println(willBuyDrink(true, 15.0)); 
        System.out.println(willBuyDrink(false, 20.0)); 
        System.out.println(willBuyDrink(true, 5.0));  
    }
}
