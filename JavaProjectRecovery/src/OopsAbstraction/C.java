package OopsAbstraction;

public class C extends B {

	@Override
	void m5() {
		// TODO Auto-generated method stub
		System.out.println("m5 from class A and B");
	}

	public static void main(String[] args) {
		
		m1(); 
		
		C obj = new C(); 
		obj.m2(); 
		
		obj.m3();
		
		obj.m4();
		
		obj.m5();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
