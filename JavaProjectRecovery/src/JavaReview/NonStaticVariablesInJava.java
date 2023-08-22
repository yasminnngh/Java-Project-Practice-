package JavaReview;

public class NonStaticVariablesInJava {

	
	public int gelNail = 50;
		
	public int nailDesign = 55;
	
	public int hairTherapy = 60;
	
	public int hairStyling = 65;
	
	public int laser = 30;
	
	public int henna = 20; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking the Variables
		
		NonStaticVariablesInJava salon = new NonStaticVariablesInJava();
		
		salon.gelNail = 57;
		salon.nailDesign = 62; 
		salon.hairTherapy = 65;
		salon.hairStyling = 70; 
		salon.laser = 35; 
		salon.henna = 25; 
		
		
		NonStaticVariablesInJava salon1 = new NonStaticVariablesInJava();
		
		salon1.gelNail = 60; 
		salon1.nailDesign = 67;
		
		
		NonStaticVariablesInJava salon2 = new NonStaticVariablesInJava();
		
		salon2.gelNail = 100;
		salon2.nailDesign = 200;
		
		
		System.out.println(salon2.gelNail);
		System.out.println(salon2.nailDesign);
		System.out.println(salon.hairTherapy);
		
	}

}
