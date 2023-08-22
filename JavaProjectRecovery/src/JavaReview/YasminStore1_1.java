package JavaReview;

public class YasminStore1_1 {

	// Defining Static Variables with Data
	
	public int manicurePrice = 45; 
	public int pedicurePrice = 35;
	public int haircutPrice = 42;
	public int facialPrice = 50;
	public int threadingPrice = 15;
	public int makeupPrice = 55;
	
	public int discount = 5; 
	
	// Defining class reference with class object on global level
	public static YasminStore1_1 store = new YasminStore1_1();  
	
	public static void manicure() {
		
		// Calling Global Static Variable in Static Method
		System.out.println("Manicure price is");
		System.out.println(store.manicurePrice); 
		
		
		
		//Calling Global Non Static Variable into Static Method
		System.out.println("Discount is");
		System.out.println(store.discount);
		
	}
	
	public static void pedicure() {
		
		System.out.println("Pedicure price is");
		System.out.println(store.pedicurePrice);
		
		
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void haircut () {
		
		System.out.println("Haircut price is");
		System.out.println(store.haircutPrice);
		
	 
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void facial() {
		
		System.out.println("Facial price is");
		System.out.println(store.facialPrice);
		
	 
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void threading () {
		
		System.out.println("Threading price is");
		System.out.println(store.threadingPrice);
		
	 
		
		System.out.println("Discount is");
		System.out.println(store.discount);
	}
	
	public static void makeup () {
		
		System.out.println("Makeup price is");
		System.out.println(store.makeupPrice);
		
	 
		
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
