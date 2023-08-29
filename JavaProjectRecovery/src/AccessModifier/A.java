package AccessModifier;

public class A {

	public static int a = 10;
	
	public int b = 20; 
	
	public static void m1() {
		System.out.println("Static Method of A Class");
	}
	
	public void m2() {
		System.out.println("Non Static Method of Class A");
	}
	
	//You cannot use Final with constructor
	//You can use Protected with constructor
	
	public A() {
		System.out.println("Constructor of A Class");
	}
	
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
