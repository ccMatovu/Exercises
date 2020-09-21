/*
Write a method filterRange that accepts an ArrayList of integers and two integer values min and max
as parameters and removes all elements whose values are
in the range min through max (inclusive) from the list.
For example, if a variable called list stores the values:
 [4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7]
The call of filterRange(list, 5, 7); should remove all values between 5 and 7,
therefore it should change the list to store [4, 9, 2, 3, 1, 8].
If no elements in range min-max are found in the list, the list's contents are unchanged.
If an empty list is passed, the list remains empty. You may assume that the list is not null.
 */


import java.util.ArrayList;
import java.util.Arrays;

public class FilterRange {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7));
        int min =5;
        int max = 7;
        filterRange(list,min,max);
        System.out.println(list);
    }

    private static void filterRange(ArrayList<Integer> list, int min, int max) {
        for(int i=list.size()-1;i>=0;--i){
            int element = list.get(i);
            for(int j=min;j<=max;j++){
                if(element == j){
                    list.remove(i);
                    j=max+1;
                }
            }
    }

    }
}
