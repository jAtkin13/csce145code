import java.util.Scanner;


public class testing {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("yes or no?");
		boolean yn = key.nextLine().toLowerCase().startsWith("y");
		
		if (yn = true) {
			System.out.println("you answered yes.");
			
		} else {
			System.out.println("you answered no.");
		}
		
	}

}
