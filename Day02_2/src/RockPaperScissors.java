import java.util.Scanner;

public class RockPaperScissors {

    static void scanForObject(){

    }

    public static void main (String[] args){

        boolean game = true;
        String userString;
        int user = 0;
        int bot = 0;
        int userPoints = 0;
        int botPoints = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play a game of rock, paper, scissors. \nBest two out of three.");

            System.out.println("What is your play? /n(Options: \"Rock\", \"Paper\", \"Scissors\"");
            userString = scan.nextLine();
            if (userString.equalsIgnoreCase("rock")){
                user = 1;
            } else if (userString.equalsIgnoreCase("paper")){
                user = 2;
            } else if (userString.equalsIgnoreCase("Scissors")){
                user = 3;
            } else {
                System.out.println("You didn't play rock, paper, or scissors, so I win the round.");
            }

    }
}
