package Error;

public class AssertionError {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 10; 
		
		assert marks >= 40: "fail"; 
		
		System.out.println("Pass");
		System.out.println(marks);
		
	}

}
