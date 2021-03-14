package Arrays;

/*
* Write a method called median that accepts an array of integers as
* its argument and returns the median of the numbers in the array.
*  The median is the number that will appear in the middle if you
* arrange the elements in order. Assume that the array is of odd
* size (so that one sole element constitutes the median) and that
* the numbers in the array are between 0 and 99 inclusive.*/

public class median {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};

        System.out.println(median(array));
    }

    public static int median(int[] array){

        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){

                if(array[i] > array[j]){
                    int temp =array[i];
                    array[i]=array[j];
                    array[j] = temp;
                }
            }
        }
        return array[(array.length/2)];
    }
}
