package OopsInheritance2;

public class B extends A {

	public static int a = 30;
	
	public int b = 50; 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
		
		
		B obj = new B();
		System.out.println(obj.b);
	
		//Invoking the global variables from parent class
		
		System.out.println(A.a);
		
		
		// Left hand is reference and right hand is object
		A obj1 = new B(); 
		System.out.println(obj1.b);
		
	}

}
