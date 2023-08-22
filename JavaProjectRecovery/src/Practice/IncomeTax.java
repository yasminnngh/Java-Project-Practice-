package Practice;

public class IncomeTax {


		
		/* Create Income Tax Sheet
		 * 250k = 0%
		 * 500k = 3%
		 * 750k = 5%
		 * more than 1M = 7%
		 */
		
		
	public static void main(String[] args) {
		
		int salary = 0;
		
		if(salary <= 250000) {
			
		System.out.println ("Not Appliable for Tax");
		
		} else if(salary >= 251000 && salary <= 500000) {
			
			double taxPer = 0.03 * salary;
			
			System.out.println("3% Tax Apply on Total Salary " + taxPer );
		}
	    else if(salary >= 500001 && salary <= 750000) {
		
		double taxPer = 0.05 * salary;
		
		System.out.println("5% Tax Apply on Total Salary " + taxPer );
	}
    else if(salary >= 751000 && salary <= 1000000) {
		
		double taxPer = 0.07 * salary;
		
		System.out.println("7% Tax Apply on Total Salary " + taxPer );
	}
    else if (salary >= 1000001) {
    	
    	double taxPer = 0.09 * salary;
    	
    	System.out.println();
    }
				
				

	}

}
