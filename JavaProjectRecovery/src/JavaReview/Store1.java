package JavaReview;

public class Store1 {

	// Global Variable Prices
	
	public static int manicure = 20;
	
	public static int pedicure = 15; 
	
	public static int haircut = 40;
	
	public static int facial = 35; 
	
	public static int threading = 12; 
	
	public static int makeup = 45; 
	
		
	
	public int gelNail = 35; 
	
	public int nailDesign = 10;
	
	public int hairTherapy = 50; 
	
	public int hairStyling = 30;
	
	public int laser = 60; 
	
	public int henna = 20;
	
	
	// Static Services
	
	public static void manicure() {
		System.out.println("Manicure");
		System.out.println(manicure);
	}
	
	public static void pedicure() {
		System.out.println("Pedicure");
		System.out.println(pedicure);
	}
	
	public static void haircut() {
		System.out.println("Haircut");
		System.out.println(haircut);
	}
	
	public static void facial() {
		System.out.println("Facial");
		System.out.println(facial);
	}
	
	public static void threading() {
		System.out.println("Threading");
		System.out.println(threading);
	}
	
	public static void makeup() {
		System.out.println("Makeup");
		System.out.println(makeup);
		
		System.out.println();
	}
	
	
	// Non Static Services
	
	public void gel() {
		System.out.println("Gel Nail");
		System.out.println(gelNail); 
	}
	
	public void nailDesign() {
		System.out.println("Nail Design");
		System.out.println(nailDesign); 
	}
	
	public void hairTherapy() {
		System.out.println("Hair Therapy");
		System.out.println(hairTherapy);
	}
	
	public void hairStyling() {
		System.out.println("Hair Styling");
		System.out.println(hairStyling);
	}
	
	public void laser() {
		System.out.println("Laser");
		System.out.println(laser);
	}
	
	public void henna () {
		System.out.println("Henna");
		System.out.println(henna);
		
		System.out.println(); 
	}
	
	
	
	public static void yasminStore1() {
		
		manicure(); 
		pedicure(); 
		haircut(); 
		facial(); 
		threading(); 
		makeup();		
		
		Store1 yasmin = new Store1();
		yasmin.gel();
		
		yasmin.nailDesign(); 
		
		yasmin.hairTherapy();
		
		yasmin.hairStyling();
		
		yasmin.laser();
		
		yasmin.henna();
		
		
		
	}
	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		yasminStore1(); 
		
		
	}

}
