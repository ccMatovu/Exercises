package Arrays;
/*
* Write a method called isMagicSquare that accepts a two-dimensional array of
*  integers as a parameter and returns true if it is a magic square.
* A square matrix is a magic square if it is square in shape (same number of rows
*  as columns, and every row the same length), and all of its row, column, and
* diagonal sums are equal. For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a
* magic square because all eight of the sums are exactly 15.*/

public class isMagicSquare {
    public static void main(String[] args) {
        int[][] array = {{2, 7, 6},{9, 5, 1},{4, 3}};

        System.out.println(isMagicSquare(array));
    }

    public static boolean isMagicSquare(int[][] array){
        if(array.length ==0){
            return true;
        }
        int rowLength = array[0].length;
        int NumberOfRows = array.length;
        int previousRowSum=0;
        int diagonal =0;
        for(int i=0;i< array.length;i++) {
            int NumberOfItemsInRow = 0; //this is the number of colums

            int rowSum = 0;

            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
                NumberOfItemsInRow++;
               // System.out.println(rowSum + "columNums  " + NumberOfItemsInRow);
            }

            if ((i != 0) && (rowSum != previousRowSum) && array[i].length != rowLength) {
                return false;
            } else {
                previousRowSum = rowSum;
            }

            if (NumberOfItemsInRow != NumberOfRows ) {
                return false;
            }

            diagonal+=array[i][i];

        }
        if(diagonal != previousRowSum){
            return false;
        }

        int columnLength = rowLength;
        for(int col=0; col < columnLength; col++){
            int columnSum=0;
            for(int row=0;row<rowLength;row++){
                columnSum += array[row][col];
            }
            if(columnSum != previousRowSum){
                return false;
            }
        }


        return true;
    }
}
