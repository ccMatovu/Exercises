package Arrays;
/*
* Write a method called collapse that accepts an array of integers as
* a parameter and returns a new array containing the result of
* replacing each pair of integers with the sum of that pair.
* For example, if an array called list stores the
* values {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, then the call of
*  collapse(list) should return a new array
* containing{9, 17, 17, 8, 19}. The first pair from the original
*  list is collapsed into 9 (7 + 2), the second pair is collapsed
*  into 17 (8 + 9), and so on. If the list stores an odd number of
* elements, the final element is not collapsed. For example, if the
*  list had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}.
*  Your method should not change the array that is passed as a
* parameter.*/

public class collapse {
    public static void main(String[] args) {
        int[] list = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        int[] collapsedList = new int[(list.length+1)/2];

        System.arraycopy(collapse(list),0,collapsedList,0,(list.length+1)/2);

        for(int z=0;z<collapsedList.length;z++){
            System.out.println(collapsedList[z]);
        }
    }
    public static int[] collapse(int[]list){
        int size=0;
        int length = list.length;
        int[] array;
        if (length % 2 == 0) {
            array = new int[length / 2];
        } else {
            array = new int[length / 2 + 1];
            array[length / 2] = list[list.length - 1];
        }

        for(int i=0;i<list.length/2;i++){
               array[i] = list[2*i] + list[2*i+1];

        }
        return array;
    }
}
