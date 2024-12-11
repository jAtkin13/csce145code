import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class EvenOrNot {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		//type casting
		int number = (int) scan.nextDouble();
		
		if(number % 2 == 0) {
			System.out.println("Number entered is even!");
		} else {
			System.out.println("Number entered is odd!");
		}
		
		
	}
}
