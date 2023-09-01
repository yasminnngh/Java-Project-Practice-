package AccessModifier;

public class D {

//Below is composition, you are invoking the methods and variables from C class.
	
	public static void main(String[] args) {
		
		System.out.println(C.a);
		
        C obj = new C();
        System.out.println(obj.b);
		
        C.m1();
        
        obj.m2(); 
        
        
	}
}
