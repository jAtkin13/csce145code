//Jack Atkinson
import java.util.Scanner;

public class TriangleDisplay {

    public static void main(String[] args) {
        //declare variables
        Scanner scan = new Scanner(System.in);
        int height;

        //enter value "height", error correct.
        do {
        System.out.println("Enter the height of a triangle.");
            height = scan.nextInt();

            if (height == 0) {
                System.out.println("Triangle height cannot be 0.");
            } else if (height < 0) {
                System.out.println("Invalid value.");
            }
        } while (height <= 0);

        //print triangle up to "height"
        System.out.println("Height: " + height);

        for (int i = 0; i <= height; i++) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
        //print triangle from "height"-1 to 0
        for (int i = height - 1; i > 0; --i) {
            int j = i;
            while (j > 0) {
                System.out.print("*");
                --j;
            }
            System.out.println();
        }

    }
}
