package JavaReview;

public class StaticAndNonStaticInSalon {

	// Calling Static
	
	public static void manicure() {
		System.out.println("Manicure");
	}
	
	public static void pedicure() {
		System.out.println("Pedicure");
	}
	
	public static void haircut() {
		System.out.println("Haircut");
	}
	
	public static void facial() {
		System.out.println("Facial");
	}
	
	public static void threading() {
		System.out.println("Threading");
	}
	
	public static void makeup() {
		System.out.println("Makeup");
		
		System.out.println();
	}
	
	
	// Calling Non Static 
	
	public void gel() {
		System.out.println("Gel Nail");
	}
	
	public void nailDesign() {
		System.out.println("Nail Design");
	}
	
	public void hairTherapy() {
		System.out.println("Hair Therapy");
	}
	
	public void hairStyling() {
		System.out.println("Hair Styling");
	}
	
	public void laser() {
		System.out.println("Laser");
	}
	
	public void henna () {
		System.out.println("Henna");
		
		System.out.println(); 
	}
	
	
	// Store Calling in Static
	
	public static void yasminStore1() {
			
		manicure(); 
		pedicure();
		haircut();
		facial();
		threading(); 
		makeup(); 
		
		StaticAndNonStaticInSalon yg2 = new StaticAndNonStaticInSalon();
		
		yg2.gel();
		yg2.nailDesign();
		yg2.hairTherapy();
		yg2.hairStyling();
		yg2.laser();
		yg2.henna();
	}
	
	
	// Store Calling in Non Static 
	public void yasminStore2() {
		
		gel();
		nailDesign();
		hairTherapy();
		hairStyling();
		laser();
		henna();
		
		manicure();
		pedicure(); 
		haircut(); 
		facial();
		threading(); 
		makeup();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		yasminStore1();
		
		StaticAndNonStaticInSalon yasmin = new StaticAndNonStaticInSalon();
		yasmin.yasminStore2();
	}

}
