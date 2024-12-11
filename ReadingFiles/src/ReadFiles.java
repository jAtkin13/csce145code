import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {
        //writing to a file
        Scanner scan = new Scanner(System.in);
        System.out.println("Standard write out to a file:");

        PrintWriter output = new PrintWriter(new FileOutputStream("file01.txt"));
        System.out.println("Enter 3 sentences: ");
    }
}
