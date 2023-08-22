package JavaReview;

public class Countries {



public static void iran() {

	System.out.println("Tehran is a Capital");
	System.out.println("Persian Carpet/Rug");
	System.out.println("Persian Tea");
	System.out.println("Persian Gulf");
	System.out.println("Saffron");
	System.out.println("Desert");
	System.out.println("Lion");
	System.out.println("Farsi");

	System.out.println();
}

public static void afghanistan() {

	System.out.println("Kabul");
	System.out.println("Dry Fruits ");
	System.out.println("Kabab");
	System.out.println("Hooka");
	System.out.println("Cricket");
	System.out.println("Hindu Kus");

	System.out.println();

}

public static void india() {

	System.out.println("Delhi");
	System.out.println("Tiger");
	System.out.println("Hockey");
	System.out.println("Samosa");
	System.out.println("Bollywood");
	System.out.println("Hindi");
	System.out.println("Himmalaya");

}

public void mexico() {
	
	System.out.println("Tacos"); 
	System.out.println("Salsa");
	System.out.println("Spanish");
	System.out.println("Gulf of Mexico");
	System.out.println("Tequila");
	System.out.println("Coffee");
	
	System.out.println();
}


public void japan() {
	
	System.out.println("Cherry Blossoms");
	System.out.println("Mount Fuji");
	System.out.println("Tokyo");
	System.out.println("Ramen");
	System.out.println("Green Tea");

	System.out.println();
}

public void germany() {
	
	System.out.println("German");
	System.out.println("Black Coffee");
	System.out.println("Mercedes");
	System.out.println("Berlin");
	System.out.println("Euro");
	
	System.out.println();
}



public static void search() {

	afghanistan(); 
	
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	Countries tokyo = new Countries();
	tokyo.japan(); 
	
	Countries mexicoCity = new Countries(); 
	mexicoCity.mexico();
	
	Countries berlin = new Countries();
	berlin.germany();
	
	 // Search Page

	 search();

}

	}