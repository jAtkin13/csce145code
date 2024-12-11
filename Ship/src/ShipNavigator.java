//Jack Atkinson
import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {

        //import objects
        Scanner scan = new Scanner(System.in);
        CruiseShip cruiseShip = new CruiseShip();
        CargoShip cargoShip = new CargoShip();
        boolean run;

        do {
            //vars, placed inside loop for reusability
            String shipType;
            boolean validType = false;
            int shipInt1 = 0;
            int shipInt2 = 0;

            //start of program
            System.out.println("\nWelcome to ShipNav!");
            System.out.println("Enter Ship Name: ");
            String shipName = scan.nextLine();
            System.out.println("Enter Ship Launch Date (mm/dd/yyyy): ");
            String shipDate = scan.nextLine();

            //ask ship type
            do {
                System.out.println("Is the ship a Cruise or Cargo ship? (Type \"Cruise\" or \"Cargo\")");
                shipType = scan.nextLine();
                if (shipType.equalsIgnoreCase("Cruise")) {
                    validType = true;
                } else if (shipType.equalsIgnoreCase("Cargo")) {
                    validType = true;
                } else {
                    System.out.println("Invalid Ship Type. Try again.");
                }
            } while (!validType);

            //cruise ship questions
            if (shipType.equalsIgnoreCase("Cruise")) {
                System.out.println("Enter the ship's Passenger Capacity: ");
                shipInt1 = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the ship's amount of Crew Members: ");
                shipInt2 = scan.nextInt();
                scan.nextLine();

                //cargo ship questions
            } else if (shipType.equalsIgnoreCase("Cargo")) {
                System.out.println("Enter the ship's tonnage (DWT): ");
                shipInt1 = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the ship's maximum speed: ");
                shipInt2 = scan.nextInt();
                scan.nextLine();

            } else {
                System.out.println("Unknown Error. Exiting Program.");
                System.exit(0);
            }

            //set ship vars and display toString
            if (shipType.equalsIgnoreCase("Cruise")) {
                System.out.println("Creating a cruise ship...");
                cruiseShip.setShipName(shipName);
                cruiseShip.setShipLaunchDate(shipDate);
                cruiseShip.setPassengerCapacity(shipInt1);
                cruiseShip.setCrewCapacity(shipInt2);

                System.out.println("Ship created, printing details...\n");
                System.out.println(cruiseShip.toString());

            } else if (shipType.equalsIgnoreCase("Cargo")) {
                System.out.println("Creating a cargo ship...");
                cargoShip.setShipName(shipName);
                cargoShip.setShipLaunchDate(shipDate);
                cargoShip.setTonnage(shipInt1);
                cargoShip.setMaxSpeed(shipInt2);

                System.out.println("Ship created, printing details...\n");
                System.out.println(cargoShip.toString());
            } else {
                System.out.println("Unknown Error. Exiting Program.");
                System.exit(0);
            }

            System.out.println("\nWould you like to construct another ship object? (Type \"Yes\" or \"No\")");
            if (scan.nextLine().equalsIgnoreCase("Yes")) {
                run = true;
            } else {
                run = false;
                System.out.println("Goodbye!");
            }
        } while (run);

    }
}
