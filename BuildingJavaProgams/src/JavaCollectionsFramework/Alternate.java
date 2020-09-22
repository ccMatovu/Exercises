package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
/*
Write a method called alternate that accepts two Lists of integers as its parameters and returns
a new List containing alternating elements from the two lists, in the following order:
  First element from first list
  First element from second list
  Second element from first list
  Second element from second list
  Third element from first list
  Third element from second list
  ...
If the lists do not contain the same number of elements, the remaining elements from the longer list
should be placed consecutively at the end.
For example, for a first list of (1, 2, 3, 4, 5) and a second list of (6, 7, 8, 9, 10, 11, 12),
a call of alternate(list1, list2) should return a list containing
(1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12).
Do not modify the parameter lists passed in.
 */



import java.util.Iterator;
import java.util.List;

public class Alternate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12));
        List<Integer> list3 = alternate(list,list2);
        System.out.println(list3);

    }

    private static List<Integer> alternate(List<Integer> list, List<Integer> list2) {
        List<Integer> sumList = new ArrayList<>();
        Iterator<Integer> listIterator =list.iterator();
        Iterator<Integer> list2Iterator = list2.iterator();

        while(listIterator.hasNext() || list2Iterator.hasNext()){
            if (listIterator.hasNext()) {
                sumList.add(listIterator.next());
            }
            if (list2Iterator.hasNext()) {
                sumList.add(list2Iterator.next());
            }
        }
        return sumList;
    }
}
