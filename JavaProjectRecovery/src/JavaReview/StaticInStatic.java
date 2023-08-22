package JavaReview;

public class StaticInStatic {

	
	public static void usaCitizen() {
		
		System.out.println("Yasmin is from USA");
		
	}

	
	public void iranianCitizen() {
		
		System.out.println("Yasmin is from Iran");
		
	}

	public static void canada () {
		
		// Calling of Static in Static
		
		usaCitizen(); 
		
		// Calling of Non Static method in Static
		
		StaticInStatic visa = new StaticInStatic(); 
		visa.iranianCitizen(); 
	}
	
	
	public void vaticanCity() {
		
		// Calling of Static in Non Static 
		
		usaCitizen(); 
		
		// Calling of Non Static in Non Static
		
		iranianCitizen(); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling Static in Main Method
		
		canada(); 
		
		//  Calling Non Static in Main Method
		
		StaticInStatic rome = new StaticInStatic();
		rome.vaticanCity(); 
	}

}
