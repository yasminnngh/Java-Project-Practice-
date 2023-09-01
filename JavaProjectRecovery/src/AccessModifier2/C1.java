package AccessModifier2;

import AccessModifier.C;

public class C1 {

	public static void main(String[] args) {
		
	System.out.println(C.a);
	
    C obj = new C();
    System.out.println(obj.b);
	
    C.m1();
    
    obj.m2(); 
	
	
	}
	
}
