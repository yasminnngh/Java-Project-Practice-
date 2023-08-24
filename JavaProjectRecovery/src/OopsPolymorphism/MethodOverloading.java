package OopsPolymorphism;

public class MethodOverloading {

	public static void m1() {
		System.out.println("Method 1");
	}
	
	public void m1(int a) {
		System.out.println("Method arg");
	}
	
	public static void m1(int b, int c) {
		System.out.println("Method args");
	}
	
	public void m1(char y) {
		System.out.println("Method with char");
	}
	
	public static void m1(boolean h) {
		System.out.println("Method with boolean");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		m1();
		
		MethodOverloading obj = new MethodOverloading();
		obj.m1(5);
		
		m1(10,15); 
		
		MethodOverloading obj1 = new MethodOverloading();
		obj1.m1('y'); 
		
		m1(true);
		
		
		
	}

}
