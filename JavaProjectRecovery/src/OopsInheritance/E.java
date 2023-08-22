package OopsInheritance;

public class E extends A {

	public static void salon() {
		System.out.println("Salon");
	}

	public void salon2() {
		System.out.println("Salon2");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(); 
		
		E obj = new E(); 
		obj.m2(); 
		
		salon(); 
		
		obj.salon2(); 
		
		
	}

}
