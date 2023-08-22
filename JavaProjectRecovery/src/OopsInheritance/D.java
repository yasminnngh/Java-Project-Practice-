package OopsInheritance;

public class D extends B {

	// D is child and B is parent
	// Since A is parent of B then in result D is the grand child

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m3();

		D obj = new D();
		obj.m4();

		m1();

		obj.m2();

		// Below is invoking the elements from C by using composition

		// If you want to invoke the static method you provide class name and . then
		// method
		C.m5();

		// For non static take the object from that particular class from which we are
		// invoking non static method and store that object in same class reference
		// variable
		C obj1 = new C();
		obj1.m6();

	}

}
