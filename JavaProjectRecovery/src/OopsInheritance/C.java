package OopsInheritance;

public class C extends A {

	// Above class is Simple Inheritance
	// Since it has common parent class it will be considered as hierarchical 
	
	
	public static void m5() {
		System.out.println("Static method of class C");
	}
	
	public void m6() {
		System.out.println("Non Static method of class C");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		m1(); 
		
		C obj = new C();
		obj.m2(); 
		
		A obj1 = new C();
		obj1.m2();
		
		m5();
		
		obj.m6(); 
		
	}

}
