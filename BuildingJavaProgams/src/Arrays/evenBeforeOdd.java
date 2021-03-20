package Arrays;

import java.util.Arrays;

/*
* Write a method called evenBeforeOdd that accepts an array of integers and
*  rearranges its elements so that all even values appear before all odds.
* For example, if the array is [5, 4, 2, 11, 9, 10, 4, 7, 3], then after the
* method has been called, one acceptable ordering of the elements would
* be [4, 2, 10, 4, 5, 11, 9, 7, 3]. The exact order of the elements does not matter,
*  so long as all even values appear before all odd values. The array might contain
*  no even elements or no odd elements. Do not use any temporary arrays in your
* solution, and do not call Arrays.sort.*/
public class evenBeforeOdd {
    public static void main(String[] args) {
        int[] array ={5,11, 10, 8};

        evenBeforeOdd(array);

        System.out.println(Arrays.toString(array));
    }

    public static int[] evenBeforeOdd(int[] array){
        boolean swap = false;
        int count =-1;
        for(int i=0;i<array.length;i++){
            if(swap == true){
                swap = false;
            }else{
                count++;
            }
            for(int j=count;j<array.length;j++){

                if((array[j] %2 != 0) && (j+1)<array.length){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swap = true;

                }else{
                    break;
                }
            }

        }
        return array;
    }
}
