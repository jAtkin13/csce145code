import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows of matrix1: ");

        int mat1_rows = scan.nextInt();

        System.out.println("Enter the number of columns of matrix1:");

        int mat1_columns = scan.nextInt();

        System.out.println("Enter the number of rows of matrix2: ");

        int mat2_rows = scan.nextInt();

        if (mat1_columns != mat2_rows) {
            System.out.println("Dimension mismatch! Cannot multiply the matrices. Exiting...");
            System.exit(0);
        }

        System.out.println("Enter the number of columns of matrix2:");

        int mat2_columns = scan.nextInt();

        //create the matrices
        int[][] matrix1 = new int [mat1_rows][mat1_columns];

        int[][] matrix2 = new int [mat2_rows][mat2_columns];


        for (int i = 0; i < mat1_rows; i++) {
            for (int j = 0; j < mat1_columns; j++) {
                System.out.println("Enter the value of the first matrix @ position (" + i + ", " + j + "): ");
                matrix1[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < mat2_rows; i++) {
            for (int j = 0; j < mat2_columns; j++) {
                System.out.println("Enter the value of the second matrix @ position (" + i + ", " + j + "): ");
                matrix2[i][j] = scan.nextInt();
            }
        }

        //matrix multiplication
        int[][] productMatrix = new int[mat1_rows][mat2_columns];
        for (int i = 0; i < mat1_rows; i++){
            for (int j = 0; j < mat2_columns; i++){
                for (int k = 0; k < mat1_columns; k++){

                }
            }
        }

    }
}
