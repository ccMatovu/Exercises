package Arrays;
/*
* Write a method named minGap that accepts an integer array as a
* parameter and returns the minimum 'gap' between adjacent values in
*  the array. The gap between two adjacent values in a array is defined
*  as the second value minus the first value. For example, suppose a
* variable called array is an array of integers that stores the
* following sequence of values.
int[] array = {1, 3, 6, 7, 12};
The first gap is 2 (3 - 1), the second gap is 3 (6 - 3), the third
*  gap is 1 (7 - 6) and the fourth gap is 5 (12 - 7). Thus, the call of
*  minGap(array) should return 1 because that is the smallest gap in
* the array. Notice that the minimum gap could bea negative number.*/
public class minGap {
    public static void main(String[] args) {
        int[] array = {1,3,6,7,12};
        System.out.println(minGap(array));
    }

    public static int minGap(int[] array){

        int min=0;
        if(array.length > 1) {
            min =array[1]-array[0];
            for (int i = 0; i < array.length - 1; i++) {

                int gap = array[i + 1] - array[i];

                if (gap < min) {
                    min = gap;
                }
            }

        }
        return min;
    }
}
