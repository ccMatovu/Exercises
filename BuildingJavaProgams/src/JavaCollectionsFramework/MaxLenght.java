/*
 * Write a method maxLength that takes a Set of strings as a parameter and
 * that returns the length of the longest string in the set. If your method
 * is passed an empty set, it should return 0.
 */

import java.util.*;

public class MaxLenght {
    public static void main(String[] args) {
        Set<String> list = new HashSet<String>();
        list.addAll(Arrays.asList("asdf","gii","alsfdasd"));
        int len = maxLength(list);
        System.out.println(len);

    }
    public static int maxLength(Set<String> set) {
        int max = 0;
        Iterator<String> i = set.iterator();

        while (i.hasNext()) {
            String word = i.next();
            if (word.length() > max) {
                max = word.length();
            }
        }

        return max;
    }
}
