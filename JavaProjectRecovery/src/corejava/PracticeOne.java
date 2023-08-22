package corejava;

public class PracticeOne {

	
	public static void m1() {
		
		System.out.println("This is a static method"); 
		
	}

	
	public void m2() {
		
		System.out.println("This is a non static method"); 
		
	}
	
	
	public static void m3() {
		
		System.out.println("This is a static method");
		
	}
	
	public void m4() {
		
		System.out.println("This is a non static method"); 
	
	}
	
		public static void main(String[] args) {
		
		
		m1 (); 
		
		PracticeOne obj = new PracticeOne(); 
		obj.m2(); 
	 
		m3 (); 
		
		obj.m4(); 
		
		
	}

}
