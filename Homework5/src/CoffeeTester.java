//Jack Atkinson

import java.util.Scanner;

public class CoffeeTester {
    public static void main(String[] args) {
        //import objects
        Scanner scan = new Scanner(System.in);
        Coffee coffee1 = new Coffee();
        Coffee coffee2 = new Coffee();

        //var for repeat runs
        boolean runProgram;

        //loop
        do {
            System.out.println("Welcome to Coffee Tester!");

            //first coffee scan
            System.out.println("\nFirst Coffee Name: ");
            coffee1.setName(scan.nextLine());
            System.out.println("First Coffee Caffeine (mg): ");
            coffee1.setCaffeine(scan.nextDouble());
            scan.nextLine(); //doesn't record, here to keep the second nextline from skipping

            //first coffee output
            System.out.println("\nCoffee Name: " + coffee1.getName());
            System.out.println("Coffee Caffeine: " + coffee1.getCaffeine());
            System.out.println("\nIt would take " + coffee1.RiskyAmount() + " cups of " + coffee1.getName() + " before it gets dangerous to drink.");


            //second coffee scan
            System.out.println("\nSecond Coffee Name: ");
            coffee2.setName(scan.nextLine());
            System.out.println("Second Coffee Caffeine (mg): ");
            coffee2.setCaffeine(scan.nextDouble());
            scan.nextLine();

            //second coffee output
            System.out.println("\nCoffee Name: " + coffee2.getName());
            System.out.println("Coffee Caffeine: " + coffee2.getCaffeine());
            System.out.println("\nIt would take " + coffee2.RiskyAmount() + " cups of " + coffee2.getName() + " before it gets dangerous to drink.");

            //compare coffees
            System.out.println("\nAre both coffee's the same? " + coffee1.equals(coffee2));

            //repeat program check
            System.out.println("Would you like to compare a second set of coffees? Enter yes or no.");
            runProgram = scan.nextLine().equalsIgnoreCase("yes");
        } while (runProgram);
    }
}
