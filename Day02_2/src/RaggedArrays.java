public class RaggedArrays {
    public static void main(String[] args) {

        //ragged arrays: arrays w/ unequal rows
        int[][] myArray = {{1,2}, {3,4,5}};

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
