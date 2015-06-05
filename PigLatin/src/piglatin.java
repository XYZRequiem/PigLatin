import java.util.Scanner;


public class piglatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize variables
		String Input = "";		
		
		Scanner in = new Scanner (System.in);
		
		// Print instruction String
		System.out.println("Input the String you wish to reverse");
		
		// User input
		Input = in.nextLine();
		in.close();
		
		System.out.println("You have inputted: " + Input);
		
		// Find length of String and convert to char
		int length = Input.length();
		char []Array = new char[length];
		
		for (int c = 0; c < length ; c++) {
			Array[c] = Input.charAt(c);
		}
		
		// Output Array
		System.out.println("\n\nChar output of String");
		
		for (int i = 0; i < length ; i++) {
			System.out.print(Array[i]);
		}
		
		// Output Pig Latin
		System.out.println("\n\nIn Pig Latin your string is: ");
		for (int i = 1; i < length; i++) {
			System.out.print(Array[i]);
		}
		
		System.out.println("-" + Array[0] + "ay");
	}

}
