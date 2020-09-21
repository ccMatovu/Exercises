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

public class InterLeave {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 8));
        interleave (list1,list2);
        System.out.println(list1);
        System.out.println(list2);

    }

    private static void interleave (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int len= (list1.size()+list2.size());
        int list1Len = list1.size()-1;
        int position =0;
        for (int i=0;i<len;i++){
            if(position >= list2.size()){
                return;
            }else if(position > list1Len){
                list1.add(i,list2.get(position));
            }else {
                list1.add(i + 1, list2.get(position));
                i += 1;
            }
            position++;
        }
    }
}
