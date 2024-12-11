import java.util.Scanner;

public class DriversLicense {

	public static final int MIN_AGE = 16;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter your age (in years): ");
		
		int age = key.nextInt();

		if(age < 0) {
			System.out.println("Invalid age entered. Quitting.");
			
			System.exit(0);
		
		} else if (age < MIN_AGE) {
			System.out.println("You need to wait another " + (MIN_AGE - age) + " years to be eligible for a driver's license");
			
		} else if (age >= MIN_AGE) {
			System.out.println("You are eligible for a driver's license.");
		} else {
			System.out.println("Unknown Error.");
		}
		
		key.close();
			
	}

}
