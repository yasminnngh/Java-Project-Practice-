package ControlStatements;

public class DiscountDeals {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int price = 115;  
		double discount = 0;
		double payable = 0; 
		
		if (price > 40 && price < 50) {
		discount = price * 0.05; 
		
		payable = price - discount; 
		
		System.out.println("Total price = " + price + " payable amount " + payable + "discount is 5%");
					
		}
		
		
		else if (price > 50 && price < 60) {
		discount = price * 0.06; 
			
		payable = price - discount; 
			
		System.out.println("Total price = " + price + " payable amount " + payable + "discount is 6%");
			
		}
		
		
		else if (price > 60 && price < 70) {
		discount = price * 0.07;
		
		payable = price - discount; 
		
		System.out.println("Total price = " + price + " payable amount " + payable + " discount is 7%");
				
		}
	
		
		else if (price > 70 && price < 80) {
		discount = price * 0.08;
			
		payable = price - discount; 
		
		System.out.println("Total price = " + price + " payable amount " + payable + " discount is 8%");
		
		}
		
		else if (price > 80 && price < 90) {
			discount = price * 0.09;
			
			payable = price - discount; 
			
			System.out.println("Total price = " + price + " payable amount " + payable + " discount is 9%");
			
		}
		
		else if (price > 90 && price < 100) {
			discount = price * 0.10;
			
			payable = price - discount; 
			
			System.out.println("Total price = " + price + " payable amount " + payable + " discount is 10%");
			
		}
		
		else if (price > 100) { 
			discount = price * 0.15;
			
			payable = price - discount; 
			
			System.out.println("Total price = " + price + " payable amount " + payable + " discount is 15%");
			
		}
		
		
		
	}

}
