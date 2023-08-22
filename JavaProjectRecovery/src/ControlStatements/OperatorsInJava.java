package ControlStatements;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Postfix
		
		int a = 10;
		
		a++;
		a--; 
		a--; 
		a--; 
		
		System.out.println(a);
		
		
		//Prefix
		
		int b = 5; 
		
		--b;
		++b; 
		++b; 
		--b; 
		--b;
		--b;
		
		System.out.println(b);
		
		
		
		//Arithmetic 
		
		int d = 20;
		int e = 40;
		
		int f = d + e;
		System.out.println(f);
		
		int g = d - e; 
		System.out.println(g);
		
		int h = d * e; 
		System.out.println(h);
		
		int i = d / e; 
		System.out.println(i);
		
		int j = d % e; 
		System.out.println(j);
		
		
		//Rational 
		
		boolean k = d > e; 
		System.out.println(k);
		
		boolean l = d < e; 
		System.out.println(l);
		
		boolean m = d == e; 
		System.out.println(m);
		
		boolean n = d >= e; 
		System.out.println(n);
		
		boolean o = d <= e; 
		System.out.println(o);
		
		boolean p = d != e; 
		System.out.println(p);
		
		
		//Logical AND &&
		// You can write more than 1 condition in AND operator
		// If 1 or more condition is false then it is FALSE
		// If all condition is true then it is TRUE
		
		// TRUE		//TRUE
		boolean q = d <= e && d != e; 
		System.out.println(q);
		
		//FALSE		//TRUE
		boolean r = d >= e && d != e;
		System.out.println(r);
		
		//TRUE		//FALSE
		boolean s = d <= e && d == e; 
		System.out.println(s);
		
		//FALSE		//FALSE
		boolean t = d >= e && d == e; 
		System.out.println(t);
		
		
		System.out.println();
		
		//Logical OR ||
		// If 1 or more condition is true then it is all TRUE
		// If all condition is false then it is FALSE
		
		// TRUE		//TRUE
		boolean u = d <= e || d != e; 
		System.out.println(u);
		
		//FALSE		//TRUE
		boolean v = d >= e || d != e;
		System.out.println(v);
		
		//TRUE		//FALSE
		boolean w = d <= e || d == e; 
		System.out.println(w);
		
		//FALSE		//FALSE
		boolean x = d >= e || d == e; 
		System.out.println(x);
		
		System.out.println();
		
		
		//Assignment 
		
		int y = 18; 
		
		y += 2;
		System.out.println(y);
		
		y -= 5;
		System.out.println(y);
		
		y *= 6;
		System.out.println(y);
		
		y /= 30; 
		System.out.println(y);
	}

}
