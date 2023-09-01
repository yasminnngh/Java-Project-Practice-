package ExceptionHandling;

public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1;
		System.out.println(a);
		
		int b = 2;
		System.out.println(b);
		
//Try and catch is exception handling.
//Try block is used to provide the risky code which might throw the exception. 
//We are using catch block for bypassing the exception. 
//To achieve this, we need to mention exception class type along with variable name. 
//In a block we are mentioning the message.
		try {
		int c = 3 / 0;
		System.out.println(c);
		}
		
		catch(Exception f) {
			System.out.println("Excpetion occured");
		}
		
		
		int d = 4;
		System.out.println(d);
		
		int e = 5; 
		System.out.println(e);
		
		
		
		
		
		
	}

}
