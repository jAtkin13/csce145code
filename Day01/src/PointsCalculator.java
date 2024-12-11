//Jack Atkinson

import java.util.Scanner;

public class PointsCalculator {

	public static void main(String[] args) {
		
		//create Scanner Object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many books did you purchase from BN this month?");
		
		//scan for amount of books, create variable to hold points
		int book = scan.nextInt();
		
		int point = 0;
		
		//close Scanner Object
		scan.close();
		
		//if statement isolates math switch from non-usable numbers
		if (book > 0) {
			//logic for if number of books is positive
			switch (book) {
				case 1:
					point = 5;
					break;
				case 2:
					point = 15;
					break;
				case 3:
					point = 30;
					break;
				default:
					point = 60;
					break;
			}
			System.out.println("Congratulations!!! You have earned " + point + " Points!\nYou may redeem these points on your next book purchase!");
		
		} else if (book == 0){
			//logic for if number of books is zero
			System.out.println("You haven't earned any points yet. Make a purchase to start earning points!");
		
		} else {
			//logic for if number of books is negative
			System.out.println("Invalid Number Entered. Exiting...");
		}
	}
}
