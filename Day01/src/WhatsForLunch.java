
import java.util.Scanner;

public class WhatsForLunch {

	public static void main(String[] args) {
		
		//print a message on the console
		
		//single-line comment
		
		
		/*
		 * Multi-line
		 * comment
		 */
		
		System.out.println("Welcome to Java: Day 01.");
		
		/*
		 * Escape Characters
		 * 		\n - new line
		 */
		
		System.out.println("\"JAVA\" is fun?");
		
		//create a Scanner object
		
		try (Scanner key = new Scanner (System.in)) {
			{
			
			System.out.println("What\'s for lunch today? Enter entree:");
			
			String entree;		//declare a variable
			
			entree = key.nextLine();
			
			// + concatenation (join) operator
			// = assignment operator
			
			System.out.println("Enter side and drink: ");
			
			String side = key.nextLine();
			
			String drink = key.nextLine();
			
			System.out.println("Entree: " + entree);
			
			System.out.println("Side: " + side);
			
			System.out.println("Drink: " + drink);
			}
		}
		
	}

}
