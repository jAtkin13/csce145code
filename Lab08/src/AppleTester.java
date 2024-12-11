//Jack Atkinson

import java.util.Scanner;

public class AppleTester {
    public static void main(String[] args) {
        //set objects
        Scanner scan = new Scanner(System.in);
        Apple appleDef = new Apple();

        //display default
        System.out.println("Default Apple:");
        System.out.println(appleDef);

        //get user options
        System.out.println("\nEnter Apple Type: \n(\"Red Delicious\", \"Golden Delicious\", \"Gala\", \"Granny Smith\")");
        String appleType = scan.nextLine();

        System.out.println("Enter Apple Weight (in kg): \n(Max Weight: 2kg)");
        double appleWeight = scan.nextDouble();

        System.out.println("Enter Apple Price:");
        double applePrice = scan.nextDouble();

        //create user-generated class
        Apple appleUser = new Apple();
        appleUser.setType(appleType);
        appleUser.setWeight(appleWeight);
        appleUser.setPrice(applePrice);

        //display user-created
        System.out.println("\nUser-Created Apple:");
        System.out.println(appleUser);
    }
}
