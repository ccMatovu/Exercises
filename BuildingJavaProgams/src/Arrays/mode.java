package Arrays;
/*
 * Write a method called mode that returns the most frequently occurring element of an
 * array of integers. Assume that the array has at least one element and that every element
 * in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower
 * value.
 */

public class mode {
    public static void main(String[] args) {
        int[] array = {27,15,15,11,27};
        System.out.println(mode(array));
    }
    public static int mode(int[] array) {
//        int[] spareArray = new int[101];
//
//        for (int i = 0; i < array.length; i++) {
//            spareArray[array[i]]++;
//        }
//
//        int mode = 101;
//        int count = 0;
//
//        for (int i = 0; i < spareArray.length; i++) {
//            if (spareArray[i] > count) {
//                count = spareArray[i];
//                mode = i;
//            }
//        }
//
//        return mode;
        int elementCount =0;
        int most=0;
        int mode = array[0];
        for(int i=1;i< array.length;i++){
            for(int j=i+1;j<array.length;j++){

                if(array[i] == array[j]){
                    elementCount++;
                }

            }

            if(elementCount > most){
                most = elementCount;
                mode = i;
            }

        }
        return array[mode];
    }
}
