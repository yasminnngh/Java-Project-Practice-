package ExceptionHandling;

public class UserDefinedException {

	public static void ageValidation(int age) {
		
		if(age >= 16) {
			System.out.println("Allowed to drive");
		}
		
		else {
			 throw new IllegalArgumentException("Not alowed to drive");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fill out form on DMV website");
		
		ageValidation(10); 
		
		System.out.println("Get DMV appointment");
		
		
	}

}
