package Methods;

public class Makeup {

	public static void face() {
		
		System.out.println("Foundation");
		System.out.println("Powder");
		System.out.println("Blush");
		System.out.println("Contour");
		
		System.out.println();
	}
	
	public static void eyes() {
		
		System.out.println("Cream");
		System.out.println("Eyeshadow");
		System.out.println("Brush");
		System.out.println("Eyeliner");
		
		System.out.println();
	}
	
	public void lips() {
		
		System.out.println("Moisterizer");
		System.out.println("Lip stick");
		System.out.println("Lip gloss");
		System.out.println("Lip liner");
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		face();
		
		eyes();
		
		Makeup lips = new Makeup();
		lips.lips(); 
		
	}

}
