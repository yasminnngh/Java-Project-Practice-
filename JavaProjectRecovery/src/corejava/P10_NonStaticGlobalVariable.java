package corejava;

public class P10_NonStaticGlobalVariable {
	
	public int a = 100; 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Calling of Non Static Variable in Main Method 
		P10_NonStaticGlobalVariable obj = new P10_NonStaticGlobalVariable(); 
		System.out.println(obj.a); 
		
		
		//Assigning New Value to Global Non Static Variable By Using Object
		P10_NonStaticGlobalVariable obj1 = new P10_NonStaticGlobalVariable();		
		
		
		obj.a=200; 
		System.out.println(obj1.a);
		System.out.println(obj1.a);
		System.out.println(obj1.a);
		System.out.println(obj1.a);
		
		P10_NonStaticGlobalVariable obj2 = new P10_NonStaticGlobalVariable();
		obj2.a = 300; 
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		

		
	}

}
