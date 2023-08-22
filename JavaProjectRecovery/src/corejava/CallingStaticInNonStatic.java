package corejava;

public class CallingStaticInNonStatic {

	public void Iran() {
		
		System.out.println("Shiraz is a city in Iran"); 
		System.out.println("Persian rugs");
		System.out.println("Kabob");
		System.out.println("Persian tea");
		System.out.println("Hafez"); 
	}
	
	public static void searchCountry() {
		
		System.out.println("Search country here");
//		Iran();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallingStaticInNonStatic tehran = new CallingStaticInNonStatic();
		tehran.Iran();
		
		searchCountry(); 
		
	}

}
