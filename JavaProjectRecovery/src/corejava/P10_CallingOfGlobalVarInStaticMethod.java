package corejava;

public class P10_CallingOfGlobalVarInStaticMethod {

	
	
	public static int a = 100;
			public int b = 200; 
	
		public static void m1 () {
			
			//Calling of Global Static Variable in Static Method 
			System.out.println(a);
			
			
			//Calling of Global Non Static Variable in Static Method
			P10_CallingOfGlobalVarInStaticMethod obj = new P10_CallingOfGlobalVarInStaticMethod(); 
			System.out.println(obj.b);
		
		}
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
	
			//Calling Static Method in Main Method
			m1();
	
	}
	

}
