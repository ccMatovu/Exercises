public class range {
    /*
    * Write a static method named range that takes an array of integers
    * as a parameter and returns the range of values contained in the array.
    *  The range of an array is defined to be one more than the difference
    *  between its largest and smallest element. For example, if the
    *  largest element in the array is 15 and the smallest is 4, the range
    *  is 12. If the largest and smallest values are the same, the range
    *  is 1.
*/



    public static void main(String[] args) {
        int[] array = {8, 3, 5, 7, 2, 4};

        int result = range(array);
        System.out.println(result);
    }

    public static int range(int[] array){
        int lowest = array[0];
        int hightest = array[0];

        for(int i = array.length-1; i > 0; i--){
            if(array[i] > hightest){
                hightest = array[i];
            }

            if(array[i] < lowest){
                lowest = array[i];
            }
        }
        return (hightest - lowest)+1;
    }

}

