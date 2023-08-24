package OopsInheritance2;

public class C extends A {

	public static int a = 15; 
	
	public int b = 25; 
	
	
	public static void m1() {
		
		int a = 1;
		int b = 2;
		
		System.out.println(a);
	    System.out.println(b);
	    
		System.out.println(C.a);
	    
		C obj = new C();
		System.out.println(obj.b);
		
		System.out.println(A.a);
		
		A obj2 = new C(); 
		System.out.println(obj2.b); 
	}
	
	
	public void m2() {
		
		int a = 100;
		int b = 200;
		
		System.out.println(C.a);
		
		System.out.println(this.b);
		
		System.out.println(a);
		
		System.out.println(b);	
		
		System.out.println(A.a);
		
		//This is to invoke non static variable b from class A
		System.out.println(super.b);
	}
	
	
	// super is when your local and global variable name is the same 
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		m1(); 
		
		C obj1 = new C(); 
		obj1.m2(); 
		
		
		
	}

}
