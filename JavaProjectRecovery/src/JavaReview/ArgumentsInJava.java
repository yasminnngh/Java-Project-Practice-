package JavaReview;

public class ArgumentsInJava {

	//Without Void is return
	//With Void is NO return
	
	
	// No Return No Argument
	
	public static void manicure() {
		
		int price = 30; 
		int discount = 5; 
		int actualPrice = price - discount; 
		
		
		System.out.println("Actual price of manicure: " +  actualPrice); 
		
		System.out.println();
	}
	
	// No Return(void) With Argument(data type with variable name)
	
	public static void pedicure(int customers) {
		
		int price = 25;
		int discount = 5;
		int actualPrice = price - discount; 
		
		System.out.println("Price after discount for pedicure for 1 customer: $" + actualPrice);
		
		int priceCalculation = actualPrice * customers; 
		System.out.println("Total Price for all customer: $" + priceCalculation); 
		
		System.out.println();
		
	}
	
	// With Return With Argument 
	
	public static int haircut(int customers) {
		
		int price = 40; 
		int discount = 10; 
		int actualPrice = price - discount; 
		
		System.out.println("Price after discount for haircut: $" + actualPrice);
		
		int priceCalculation = actualPrice * customers; 
		// System.out.println("Total Price for all customer: $" + priceCalculation);
		
		return priceCalculation;
		
	}
	
	// With Return No Argument
	public static int facial() {
		
		int price = 30; 
		int discount = 5;
		int actualPrice = price - discount;
		int customer = 200; 
		int priceCalculation = actualPrice * customer; 
		
		System.out.println("Price after discount for facial: $" + actualPrice);
		
		// System.out.println("Total price for all customers: $" + priceCalculation);
		
		return priceCalculation; 
		
	}
	
	// No Return No Argument
	
	public void gelNail() {
		
		int price = 50; 
		int discount = 10; 
		int actualPrice = price - discount; 
		
		System.out.println("Price after discount for Gel Nail: $ + actualPrice");
		
		System.out.println(); 
		
	}
	
	// No Return(void) With Argument(data type with variable name)
	
	public void nailDesign(int customer) {
		
		int price = 15;
		int discount = 5; 
		int actualPrice = price - discount; 
		int priceCalculation = actualPrice * customer; 
		
		System.out.println("Price after discount for Nail Design: $" + actualPrice);
		
		System.out.println();
		
	}
	
	// With Return With Argument 
	
	public int hairStyling(int customer) {
		
		int price = 60;
		int discount = 10;
		int actualPrice = price - discount;
		int priceCalculation = actualPrice * customer; 

		return priceCalculation; 
	}
	
	// With Return No Argument 
	
	public int henna(){
		
		int price = 20; 
		int discount = 5;
		int actualPrice = price - discount; 
		int customer = 13; 
		int priceCalculation = actualPrice * customer; 
		
		System.out.println("Price after discount: $" + actualPrice); 
		
		return priceCalculation; 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		manicure(); 
		
		pedicure(5275); 
		
		System.out.println(haircut(47)); 
		System.out.println();
		
		System.out.println(facial());
		System.out.println();
		
		ArgumentsInJava salon = new ArgumentsInJava(); 
		salon.gelNail();
		
		salon.nailDesign(26);
		
		System.out.println(salon.hairStyling(17));
		System.out.println();
		
		System.out.print(salon.henna());
		System.out.println();
		
	

		
	}

}
