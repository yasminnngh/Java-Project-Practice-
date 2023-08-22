package OopsInheritance;

public class A {

	public static void m1 () {
		System.out.println("Static method of class A");
	}
	
	public void m2 () {
		System.out.println("Non Static method of class A");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		m1(); 
		
		// A is the class reference 
		// obj is the class reference variable 
		
		A obj = new A(); 
		obj.m2(); 
		
		E.salon();
		
		E obj1 = new E();
		obj1.salon2();
		
	 }

}
