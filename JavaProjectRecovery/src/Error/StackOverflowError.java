package Error;

public class StackOverflowError {

	public static void m1() {
		System.out.println("Static method 1");
		m2(); 
	}
	
	
	public static void m2() {
		System.out.println("Static method 2");
		m1(); 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(); 
		
		
	}

}
