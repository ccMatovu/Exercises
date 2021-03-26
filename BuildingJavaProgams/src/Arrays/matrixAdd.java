package Arrays;

import java.util.Arrays;

public class matrixAdd {
    public static void main(String[] args) {
        int[][] array1 ={{1,5,3,4},{6,2,3,0}};
        int[][] array2 ={{5,3,9,2},{8,6,2,1}};

        int[][] result = new int[array2.length][array1[0].length];
        //System.out.println("result= "+Arrays.deepToString(result));

        result = matrixAdd(array1,array2).clone();

        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] matrixAdd(int[][] array1,int[][] array2){


        if(array1.length == 0 && array2.length == 0){
            return new int[0][0];
        }

        int[][] matrixSum = new int [array1.length][array1[0].length];


        //System.out.println(Arrays.deepToString(matrixSum));
        //System.out.println(array1[0].length);
        for(int row=0; row < array1.length; row++){
            for(int col=0; col < array1[row].length; col++){

                int sum = array1[row][col] + array2[row][col];

                matrixSum[row][col]=sum;
                //System.out.println("row= "+row+"\ncol= "+col+"\n\n");

            }
        }
        return matrixSum;
    }
}
