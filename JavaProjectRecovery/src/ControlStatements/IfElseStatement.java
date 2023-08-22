package ControlStatements;

public class IfElseStatement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 2;
		int b = 20;
		
		boolean g = a <= 10; 
		System.out.println(g);
		
		boolean h = a >= 10; 
		System.out.println(h);
		
		
		
		// Below is the condition and if true then it will execute (called controlling)
		//Type 1 (1 block, if)
		if(a >= 10) {
			
			int c = a + b; 
			
			System.out.println(c);
		}
		
		// Type 2 (2 blocks, if and else)
		if(a >= 10) {
			
			int c = a + b; 
			
			System.out.println(c);
		}
		
		else {
			
			int d = a - b; 
			
			System.out.println(d);
			
		}
		
		System.out.println();
		
		//Else if ladder 
		
		int e = 10000; 
		int f = 200;
		int i = 30; 
		
		if (e >= i && e >= f) {
			System.out.println("e is greater than i and f");
			
		}
		
		else if (f > e && f > i) {
			System.out.println("f is greater than e and i");
			
		}
		
		else  {
			
			System.out.println("i is greater than e and f");
		}
		
		System.out.println();
		
		
		//Nested If
		
		int l = 10000;
		int m = 5000;
		
		if (l == 10000) {
			System.out.println("Value is matching for l");
			
			if (m == 5000) {
				System.out.println("Value is matching for m");
				
				int n = l + m;
				System.out.println(n);
				
			}
			
		}
		
		else {
			System.out.println("Values are not matching");
		}
		
		
		
	}

}
