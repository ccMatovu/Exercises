package Arrays;

import java.util.Arrays;

public class matrixAdd {
    public static void main(String[] args) {
        int[][] array1 ={{1,5,3,4},{6,2,3,0}};
        int[][] array2 ={{5,3,9,2},{8,6,2,1}};

        int[][] result = new int[array2.length][array1.length];

        result = matrixAdd(array1,array2).clone();
    }

    public static int[][] matrixAdd(int[][] array1,int[][] array2){
    }
}
