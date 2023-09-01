package OopsAbstraction2;

public class Amazon implements A, B {

	@Override
	public void homePage() {
		// TODO Auto-generated method stub
		System.out.println("Home Page of Amazon");
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Login Page of Amazon");
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("Create Account for Amazon");
	}

	@Override
	public void language() {
		// TODO Auto-generated method stub
		System.out.println("Choose Language");
	}

	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		System.out.println("Add to Cart");
	}

	@Override
	public void returnOrder() {
		// TODO Auto-generated method stub
		System.out.println("Return Order");
	}

	
	@Override
	public void beuatyProducts() {
		// TODO Auto-generated method stub
		System.out.println("Beuaty Products");
	}

	@Override
	public void clothing() {
		// TODO Auto-generated method stub
		System.out.println("Clothing");
	}

	@Override
	public void toys() {
		// TODO Auto-generated method stub
		System.out.println("Toys");
	}

	@Override
	public void kitchen() {
		// TODO Auto-generated method stub
		System.out.println("Kitchen");
	}

	@Override
	public void furniture() {
		// TODO Auto-generated method stub
		System.out.println("Furniture");
	}

	@Override
	public void outdoorProducts() {
		// TODO Auto-generated method stub
		System.out.println("Outdoor Products");
	}

	@Override
	public void electronics() {
		// TODO Auto-generated method stub
		System.out.println("Electronics");
	}
	
	
	
	public static void main(String[] args) {
		
	
		
	Amazon obj = new Amazon(); 
	obj.homePage();
	
	obj.login(); 
	
	obj.createAccount();
	
	obj.language();
	
	obj.addToCart();
	
	obj.returnOrder();
		
	obj.beuatyProducts();
	
	obj.clothing(); 
	
	obj.toys();
	
	obj.kitchen();
	
	obj.furniture();
		
	obj.outdoorProducts();
	
	obj.electronics(); 
	
	System.out.println(a);
		
	
	
	}

	
}
