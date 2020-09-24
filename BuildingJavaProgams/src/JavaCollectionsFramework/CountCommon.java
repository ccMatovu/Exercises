/*
Write a method countCommon that takes two Lists of integers as parameters and returns the number of
unique integers that occur in both lists.
Use one or more Sets as storage to help you solve this problem.
For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other list
contains the values [-5, 15, 2, -1, 7, 15, 36], your method should return 4
(because the elements -1, 2, 7, and 15 occur in both lists).
*/

import java.util.*;

public class CountCommon {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));

        int num = countCommon(list1,list2);
        System.out.println(num);

    }

    private static int countCommon(List<Integer> list1, List<Integer> list11) {
        int count =0;
        Set<Integer> check1 = new HashSet<Integer>(list1);
        Iterator<Integer> ite1 = check1.iterator();
        while(ite1.hasNext()){
            if(list11.contains(ite1.next())){
                count++;

            }
        }
        return count;
    }
  //  other solution
//    private static int countCommon(List<Integer> list1, List<Integer> list11) {
//        Set<Integer> check1 = new HashSet<>(list1);
//        check1.retainAll(list11);
//        return check1.size();
//    }


}
