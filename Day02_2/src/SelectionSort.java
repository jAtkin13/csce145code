import java.util.Scanner;

public class SelectionSort {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to sort?");

        int size = scan.nextInt();

        //create array
        int[] myArray = new int[size];

        //store user input
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Enter the value of the array at index" + i + ":");
                myArray[i] = scan.nextInt();
        }

        for(int i = 0; i < myArray.length; i++){
            int min = i;
            int smallest = myArray[i];

            for (int j = i+1; j < myArray.length; j++){
                if (myArray[j] < smallest) {
                    smallest = myArray[j];
                    min = j;
                }
            }

            if (smallest < myArray[i]) {
                int temp = myArray[i];
                myArray[i] = myArray[min];
                myArray[min] = temp;
            }
        }

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i] + " ");
        }

    }
}
