import java.util.Scanner;

public class GrreaterThanAValue {

	public static final int VALUE = 1000;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int number = key.nextInt();
			
			if (number > VALUE) {
				
				System.out.println("This number is greater than 1000.");
			}
		

	}

}
