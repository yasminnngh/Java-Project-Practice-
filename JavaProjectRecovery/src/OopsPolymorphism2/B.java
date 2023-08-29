package OopsPolymorphism2;

public class B extends A {

	// Static methods are not following the overriding,because of 
	// method hiding. 
	// When you run it, it will only execute the native method. 
	
	// Method overriding 
	
	public static void m1(int a) {
		System.out.println("Static method of child class ");
	}
	
	
	public void m2(int a) {
		System.out.println("Non Static Method of Child Class");
	}
	
//  Constructors don't follow inheritance
//	public A() {
//		System.out.println("Constructor of Parent Class");
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(10); 
		
		B obj = new B();
		obj.m2(5);
		
		A obj1 = new B();
		//Complier suggests non static method from class A 
		//but... during execution it will run non static method from 
		//B class. Then, hence is proved.
		//Method execution is dependent on object of the class. 
		obj1.m2(10); 
		
		A obj2 = new A(); 
		obj2.m2(15);
		
		System.out.println(a);
		
		System.out.println(obj.b); 
		
	}

}
