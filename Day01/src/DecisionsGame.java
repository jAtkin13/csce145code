import java.util.Scanner;

public class DecisionsGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String contestant1Prize = "nothing";
		String contestant2Prize = "nothing";
		
		String markerPrize = "red marker";
		String deskPrize = "black pen";
		String bagPrize = "kit kat";
		
		System.out.println("Contestant 1: I will give you this marker. Would you like to keep it or trade it with what\'s on my desk or what\'s in my bag? (Enter \"Keep\", \"Desk\", or \"bag\")");
		
		String response = scan.next();

		if(response.equalsIgnoreCase("desk")) {
			contestant1Prize = deskPrize;
			System.out.println("Contestant 2, Would you like to keep the marker or trade it with what\'s in my bag? (Enter \"Keep\" or \"Bag\".)");
			
			String response2 = scan.next();
			
			if (response2.equalsIgnoreCase("Bag")) {
				contestant2Prize = bagPrize;
			} else if (response2.equalsIgnoreCase("Keep")) {
				contestant2Prize = markerPrize;
			} else {
				System.out.println("You got nothing.");
			}
			
		} else if (response.equalsIgnoreCase("bag")) {
			contestant1Prize = bagPrize;
			System.out.println("Contestant 2, Would you like to keep the marker or trade it with what\'s on my desk? (Enter \"Keep\" or \"Desk\".)");
			
			String response2 = scan.next();
			
			if(response2.equalsIgnoreCase("Desk")) {
				contestant2Prize = deskPrize;
			} else if (response2.equalsIgnoreCase("Keep")) {
				contestant2Prize = markerPrize;
			} else {
				System.out.println("You got nothing.");
			}
			
			
		} else if (response.equalsIgnoreCase("keep")) {
			contestant1Prize = markerPrize;
			System.out.println("Contestant 2, Would you like what\'s on my desk or what\'s in my bag? (Enter \"Desk\" or \"Bag\".)");
			
			String response2 = scan.next();
			
			if(response2.equalsIgnoreCase("Desk")) {
				contestant2Prize = deskPrize;
			} else if (response2.equalsIgnoreCase("Bag")) {
				contestant2Prize = bagPrize;
			} else {
				System.out.println("You got nothing.");
			}
			
		} else { 
			System.out.println("You got nothing.");
			System.out.println("Contestant 2: Would you like to keep the marker or trade it with what\'s on my desk or what\'s in my bag? (Enter \"Keep\", \"Desk\", or \"bag\")");
			
			String response2 = scan.next();
			
			if(response2.equalsIgnoreCase("Desk")) {
				contestant2Prize = deskPrize;
			} else if (response2.equalsIgnoreCase("Bag")) {
				contestant2Prize = bagPrize;
			} else if (response2.equalsIgnoreCase("Keep")) {
				contestant2Prize = markerPrize;
			} else {
				System.out.println("You got nothing.");
			}
		}
		
		scan.close();
		
		System.out.println("Contestant 1 gets " + contestant1Prize);
		System.out.println("Contestant 2 gets " + contestant2Prize);
	
	}
}
