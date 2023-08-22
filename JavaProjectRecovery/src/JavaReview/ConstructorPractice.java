package JavaReview;

public class ConstructorPractice {
/*
 * Constructors are specialized method
 * Constructor name and class name should be the same
 * Constructor is a non static entity
 * Constructor cannot have any return type (void)
 * When the object is created then only the constructor will be called
 * Multiple constructors are present in the same class with different arguments
 * Parameterized is constructor with an argument
 * Non Parameterized is constructor without argument 
 * this is used for calling a constructor 
 * */
	
	
	
	public ConstructorPractice() {
		System.out.println("I am learning constructors");		
		
	}
	
	public ConstructorPractice(int a) {
		
		this();
		
		System.out.println("I am learning constructors");	
	}
	
	public ConstructorPractice(int b, int c) {
		
		this(10);
	
		System.out.println("I am learning constructors");		
	}
	
	public ConstructorPractice(int b, int c, int d) {
		
		this(15,20);
		
		System.out.println("I am learning constructors");	
	}
	
	public ConstructorPractice(char a) {
		
		this(35, 40, 45);
		
		System.out.println("I am learning constructors");	
	}
	
	public ConstructorPractice(char b, char c) {
		
		this('5');
		
		System.out.println("I am learning constructors");	
	}
	
	public ConstructorPractice(boolean t ) {
		
		this('z', 'q');
		
		System.out.println();
	}
	
	public ConstructorPractice(boolean z, boolean r ) {
		
		this(true); 
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	  new ConstructorPractice(); 
//	  
//	  new ConstructorPractice(10); 
//	  
//	  new ConstructorPractice(15, 20); 
//	  
//	  new ConstructorPractice(35, 40, 45); 
//	  
//	  new ConstructorPractice('5'); 
//	  
//	  new ConstructorPractice('$', '?'); 
		
		// new ConstructorPractice('3', '!'); 
		
		new ConstructorPractice (true, false);
		
		
	}

}
