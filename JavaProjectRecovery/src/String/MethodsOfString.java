package String;

public class MethodsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Yasmin";

//char At is method 1
//Takes index from user and provides the character, held by the specific index
		char b = a.charAt(1);
		System.out.println(b);

//Concat method 2
//The main purpose is to join/connect the two different strings together
		String c = " Ghahramani";
		String d = a.concat(c);
		System.out.println(d);

//Length method 3
// This represents the amount of characters/letters in the string
		int e = a.length();
		System.out.println(e);

//To Upper Case method 4
//Purpose of upper case method is to make whole character/word upper case.
		String f = a.toUpperCase(); 
		System.out.println(f);
		
//To Lower Case method 5
//Purpose of lower case method is to make whole character/word lower case.
		String g = a.toLowerCase();
		System.out.println(g);
		
//Equals method 6
//Purpose is to compare the String value with considering case sensitivity
		boolean h = a.equals("Yasmin"); 
		System.out.println(h);
		
//Equals Ignore Case method 7 
//Purpose is to compare the String value without considering case sensitivity
		boolean i = a.equalsIgnoreCase("yasmin");
		System.out.println(i);
		
//Is blank method 8 
//Purpose is to see if String is blank or not 
		boolean j = a.isBlank();
		System.out.println(j);
		
//Is empty method 9
//Purpose is to see if String is empty or not 
		boolean k = a.isEmpty();
		System.out.println(k);
		
//Substring method 10
//Purpose is to generate new string from old/pre-existed string by providing the beg. index.
		String l = a.substring(3);
		System.out.println(l);
		
//Substring (beginning index & end index) method 11
//is to generate new string from old/pre-existed string by providing the beg. index and end index
		String m = a.substring(1, 5);
		System.out.println(m);
		
//Replace method 12
//Purpose is to replace old character with new character
		String n = a.replace('Y', 'J');
		System.out.println(n);
		
//Replace all method 13
//Purpose is to replace set of characters with new set of characters
		String o = n.replaceAll("min", "neet");
		System.out.println(o);
		
//Index of method 14
		
		
		
		
		
	}

}
