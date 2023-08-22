package ControlStatements;

public class IfAndElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				String weather = "Spring";

				if (weather.equalsIgnoreCase("Rain")) {

					System.out.println("Pick an umbrella ");
				} 
				else if (weather.equalsIgnoreCase("Winter")) {

					System.out.println("Pick the Warm Clothes");
				} 
				else if (weather.equalsIgnoreCase("Spring")) {
					
					System.out.println("Pick the Bright Color Clothing");
				}

				else {

					System.out.println("Pick a hat");
				}
		
		
	}

}
