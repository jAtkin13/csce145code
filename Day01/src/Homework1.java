import java.util.Scanner;

public class Homework1 {

	public static final int MATH = 2024;
	
	public static void main(String[] args) {
		//Jack Atkinson
		
		//import scanner
		Scanner scan = new Scanner(System.in);
		
		//Start grabbing variables
		System.out.println("Hi there! What's your first name?");
		String first = scan.nextLine();
			
		System.out.println(first + "... That's a cool name! What about your last name?");
		String last = scan.nextLine();
		
		System.out.println("Alright. Now, I just need to know a couple more things. First, how old are you?");
		int age = scan.nextInt();
			
		System.out.println("So you're " + age + "? Alright. Was your last birthday this year? (Please enter true or false.)");
		boolean ageyn = scan.nextBoolean();
		scan.nextLine(); // NextInt and NextDouble does not reset the line, and will cause the next question to skip. This scan.nextLine is sacrificial and does not serve other purpose.
		
		System.out.println("Cool! How about your phone number? (Enter in plain number format.)" );
		String phone = scan.nextLine();
		
		System.out.println("Alright, last boring question. What is today's date? (Enter as MM/DD/YYYY) ");
		String date = scan.nextLine();
		
		System.out.println("What's your major?");
		String major = scan.nextLine();
		
		System.out.println("And are you a freshman, a sophomore, a junior, or a senior?");
		String cYear = scan.nextLine();
		
		System.out.println("That's pretty cool. Now we're getting to the last couple questions. What's your favorite snack?");
		String snack = scan.nextLine();
		
		System.out.println("Oh I like those! How about your lucky number?");
		String lucky = scan.nextLine();
		
		System.out.println("What's your favorite club?");
		String club = scan.nextLine();
		
		//close Scanner
		scan.close();
		
		//Start doing conversion math
		
		String mm = date.substring(0,2);
		String dd = date.substring(3,5);
		String yyyy = date.substring(6,10);
		
		String finalPhone = "(" + phone.substring(0,3) + ") " + phone.substring(3,6) + "-" + phone.substring(6,10);
		
		int yearBorn;
		
		if (ageyn) {
			yearBorn = MATH - age;
		} else {
			yearBorn = MATH - age - 1;
		}
		
		//Start printout of information
		System.out.println("\nAlright. Here's what I know about you.");
		System.out.println(first + " " + last + ":");
		System.out.println("You are " + age + " and were born in the year " + yearBorn + ". You're a " + major + " major, and you're in your " + cYear + " year here at USC.");
		System.out.println("You also have a couple favorite things: Your favorite club is " + club + ", your favorite snack is " + snack + ", and your lucky number is " + lucky + ".");
		System.out.println("Finally, you can be reached at " + finalPhone + ".");
		System.out.println("Last Updated: " + dd + "." + mm + "." + yyyy);

		
	}
}
