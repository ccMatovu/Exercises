/*
Write a method countUnique that takes a List of integers as a parameter and returns the number of
unique integer values in the list.
Use a Set as auxiliary storage to help you solve this problem.
For example, if a list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method should
return 5.
The empty list contains 0 unique values.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountUnique {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        int num = countUnique(list);
        System.out.println(num+"   "+list);
    }

    private static int countUnique(List<Integer> list) {
        int val = new HashSet<>(list).size();;

        return val;
    }
}
