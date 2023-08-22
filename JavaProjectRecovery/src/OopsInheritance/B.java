package OopsInheritance;

public class B extends A {

// Above class is Simple Inheritance
	
	
	public static void m3() {
		System.out.println("Static method of B class");
	}
	
	public void m4() {
		System.out.println("Non Static method of B class");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		m1(); 
		
		// Left hand side of equal is reference 
		// Right hand side of equal is object
		
		B obj = new B();
		obj.m2();
		
		m3(); 
		
		obj.m4(); 
	
	}

}
