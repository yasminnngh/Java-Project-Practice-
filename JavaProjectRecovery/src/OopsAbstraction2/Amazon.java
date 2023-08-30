package OopsAbstraction2;

public class Amazon implements A {

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

	
	public static void main(String[] args) {
		
		
		
	Amazon obj = new Amazon(); 
	obj.homePage();
	
	obj.login(); 
	
	obj.createAccount();
	
	obj.language();
	
	obj.addToCart();
	
	obj.returnOrder();
		
		
		
	}
}
