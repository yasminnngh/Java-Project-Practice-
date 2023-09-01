package AccessModifier;

public class C {

	public static int a = 10;
	
	public int b = 20; 
	
	public static void m1() {
		System.out.println("Static Method of C Class");
	}
	
	public void m2() {
		System.out.println("Non Static Method of Class C");
	}
	
	//You cannot use Final with constructor
	//You can use Protected with constructor
	
	public C() {
		System.out.println("Constructor of C Class");
	}
	
	 

	
}
