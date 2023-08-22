package JavaReview;

public class YasminStore1 {

	// Defining Static Variables with Data
	
	public static int manicurePrice = 45; 
	public static int pedicurePrice = 35;
	public static int haircutPrice = 42;
	public static int facialPrice = 50;
	public static int threadingPrice = 15;
	public static int makeupPrice = 55;
	
	public int discount = 5; 
	
	// Defining class reference with class object on global level
	public static YasminStore1 store = new YasminStore1();  
	
	public static void manicure() {
		
		// Calling Global Static Variable in Static Method
		System.out.println("Manicure price is");
		System.out.println(manicurePrice); 
		
		
		
		//Calling Global Non Static Variable into Static Method
		System.out.println("Discount is");
		System.out.println(store.discount);
		
	}
	
	public static void pedicure() {
		
		System.out.println("Pedicure price is");
		System.out.println(pedicurePrice);
		
		
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void haircut () {
		
		System.out.println("Haircut price is");
		System.out.println(haircutPrice);
		
	 
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void facial() {
		
		System.out.println("Facial price is");
		System.out.println(facialPrice);
		
	 
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void threading () {
		
		System.out.println("Threading price is");
		System.out.println(threadingPrice);
		
	 
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void makeup () {
		
		System.out.println("Makeup price is");
		System.out.println(makeupPrice);
		
	 
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	
	public static void store1() {
		// Calling Static in Static 
		manicure(); 
		pedicure();
		haircut();
		facial();
		threading();
		makeup();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking Static in Main Method
		
	store1();  
		
		
	}

}
