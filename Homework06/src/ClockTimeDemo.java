//Jack Atkinson
import java.util.Scanner;

public class ClockTimeDemo {

    public static void main(String[] args) throws TimeException {

        //set objects
        Scanner scan = new Scanner(System.in);
        TimeConverter time1 = new TimeConverter();
        TimeConverter time2 = new TimeConverter();

        //vars
        int hours;
        int minutes;
        int seconds;
        String time;

        boolean check;
        do {
            check = false;
            //set first time
            System.out.println("Enter Hours on military clock");
            hours = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter Minutes on military clock");
            minutes = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter Seconds on military clock");
            seconds = scan.nextInt();
            scan.nextLine();

            time1.updateTime(hours, minutes, seconds);

            System.out.println("Time in 12 hour format: " + time1.displayTime());

            //set second time
            System.out.println("Enter Time in hh:mm:ss format");
            time = scan.nextLine();

            time2.updateTime(time);

            System.out.println("Time in 12 hour format: " + time2.displayTime());

            System.out.println("Enter Time in hh:mm:ss format");

            System.out.println("Rerun Program? (Y/N)");
            if (scan.nextLine().equalsIgnoreCase("y")) {
                check = true;
            }
        } while (check);
        System.out.println("Exiting Program...");
    }
}
