package Arrays;

public class TraditionalArrays {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5]; 
		
		a[0] = 10; 
		
		a[1] = 15;
		
		a[2] = 20;
		
		a[3] = 35;
		
		a[4] = 40; 
		
		//Below is forward loop
		
//		for(int i = 0; i < a.length; i++) {
//			
//			System.out.println(a[i]);
//			
//		}
		
		//Below is for each loop 
		//Advanced for loop
		
//		for(int number : a) {
//			
//			System.out.println(number);
//			
//		}
		
		
		for(int i = a.length -1; i >= 0; i--) {
			
			System.out.println(a[i]);
			
		}
		
		
		
	}

}
