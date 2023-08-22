package corejava;

public class P7_CallingStaticInNonStatic {
	
	public static void m1 () {
		
		System.out.println ("Calling Static method in non staic method"); 
	}
	
	
	public void m2 () {
		
		m1() ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P7_CallingStaticInNonStatic obj = new P7_CallingStaticInNonStatic ();
		
		obj.m2 ();
	}

}
