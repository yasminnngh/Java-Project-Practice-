package OopsInheritance3;

public class A {

	public A() {
		System.out.println("Non Parameterized Constructor Of Parent");
	}
	
	public A(int a) {
		System.out.println("Parameterized Constructor Of Parent");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new A(); 
		
		new A(5); 
		
		
	}

}
