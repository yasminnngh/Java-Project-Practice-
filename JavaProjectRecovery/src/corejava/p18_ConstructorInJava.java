package corejava;

public class p18_ConstructorInJava {

	public p18_ConstructorInJava() {
		
		
		System.out.println("Constructor");
	
	}
		
		public static void m1() {	
		
		System.out.println("Non static method");
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Invoking the constructor in main method
		
		p18_ConstructorInJava obj = new p18_ConstructorInJava();
		obj.m1(); 
	}
}
