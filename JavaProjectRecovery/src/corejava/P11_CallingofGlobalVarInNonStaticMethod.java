package corejava;

public class P11_CallingofGlobalVarInNonStaticMethod {

	
	public static int a = 100; 
	public int b = 200;
	
	
	public void m1 () {
		
		//Calling Global Static Variable in Non Static Method
		System.out.println(a); 
		
		//Calling Global Non Static Variable in Non Static Method
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Calling Non Static Method in Main Method 
		
		P11_CallingofGlobalVarInNonStaticMethod obj = new P11_CallingofGlobalVarInNonStaticMethod();
		obj.m1();
	
	}

}
