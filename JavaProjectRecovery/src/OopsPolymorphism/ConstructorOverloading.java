package OopsPolymorphism;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("Constructor 1");
	}
	
	public ConstructorOverloading(int a) {
		System.out.println("Constructor 2");
	}
	
	public ConstructorOverloading(char y) {
		System.out.println("Constructor 3");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 new ConstructorOverloading();
	
	 new ConstructorOverloading(5); 
	 
	 new ConstructorOverloading('y');
	
	
		
		
	}

}
