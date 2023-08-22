package corejava;

public class P6_CallingNonStaticInStatic {
	
	public void m1 () {
	
		System.out.println ("Calling Non static method in static method ");
		
}

	public static void m2 () {
		
		 P6_CallingNonStaticInStatic obj = new P6_CallingNonStaticInStatic () ; 
		 obj.m1();
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m2 ();

	}

}
