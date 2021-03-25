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
        int[][] array = {{2, 7, 6},{9, 5, 1},{4, 3,8}};

        System.out.println(isMagicSquare(array));
    }

    public static boolean isMagicSquare(int[][] array){
        if(array.length ==0){
            return true;
        }
        int rowLength = array[0].length;
        int colNum =0;
        int previousSum=0;
        for(int i=0;i< array.length;i++){
            colNum++;
            int currentSum=0;

            for (int j=0;j<array[i].length;j++){
                currentSum+=array[i][j];
                System.out.println(currentSum);
            }

            if(i !=0 && currentSum != previousSum){
                return false;
            }else{
                previousSum = currentSum;
            }
            if(array[i].length != rowLength){
                return false;
            }
        }
        if(colNum != rowLength){
            return false;
        }

        return true;
    }
}
