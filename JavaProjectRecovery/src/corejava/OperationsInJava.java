package corejava;

public class OperationsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 5;
		
		// Unary
		// Post fix (a ++ a --)
		a++;
		System.out.print(a); // 6 
		// Pre-fix
		++a; 
		System.out.println(a); // 7
		
		//Post fix
		a--; 
		System.out.println(a); // 6
		
		//Pre-fix
		--a;
		System.out.println(a); // 5
		
		
		//
		int b = 1; 
		int c = 1; 
		
		int d = b / c; 
		
		System.out.println(b / c);
		System.out.println(d);
		
		int a1 = 10;
		int b1 = 9;
		
		int c1 = a1%b1;
		
		System.out.println(c1); 

	}

}
