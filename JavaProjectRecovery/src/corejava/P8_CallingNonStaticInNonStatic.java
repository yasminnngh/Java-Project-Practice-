package corejava;

public class P8_CallingNonStaticInNonStatic {
	
	public static void m1 () {
		
		System.out.println ("Calling non static in non static");
	}
	
	public void m2 () {
		
		m1 ();
		
	}
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		P8_CallingNonStaticInNonStatic obj = new P8_CallingNonStaticInNonStatic() ;
		obj.m2();
	}

}
