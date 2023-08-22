package corejava;

public class P5_CallingStaticInStatic {
	
	public static void m1 () {
		
		System.out.println("Calling of staic method in static method ");
	}
	
	public static void m2 () {
		
		m1 (); 
	}
	
	
	
	
	
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		
		m2 (); 
	}

}
