/*
Write a method hasOdd that takes a Set of integers as a parameter and that returns true if the set
contains at least one odd integer, and false otherwise.
If passed the empty set, your method should return false.
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HasOdd {
    public static void main(String[] args) {
        Set<Integer> set= Stream.of(22, 23, 12,1,5,99).collect(Collectors.toCollection(HashSet::new));
        System.out.println(hasOdd(set));
    }

    private static boolean hasOdd(Set<Integer> set) {
        for (Integer i : set) {
            if (i % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
