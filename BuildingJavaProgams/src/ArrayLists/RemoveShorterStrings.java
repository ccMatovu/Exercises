/*
Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that
removes from each successive pair of values the shorter string in the pair.
For example, suppose that an ArrayList called list contains the following values:
{"four", "score", "and", "seven", "years", "ago"}
In the first pair, "four" and "score", the shorter string is "four".
In the second pair, "and" and "seven", the shorter string is "and".
In the third pair, "years" and "ago", the shorter string is "ago".
Therefore, the call: removeShorterStrings(list); should remove these shorter strings, leaving
the list as follows: "score", "seven", "years".
If there is a tie (both strings have the same length),
your method should remove the first string in the pair.
If there is an odd number of strings in the list, the final value should be kept in the list.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveShorterStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Don't", "remove", "the", "last", "string (me)"));
        removeShorterStrings(list);
        System.out.println(list);
    }

    private static void removeShorterStrings(ArrayList<String> list) {
        int start=list.size();
        if((start%2)==0){
             start = start-2;
        }else {
             start = start-3;
        }
        for(int i= start;i>=0;i-=2){
            if((list.get(i).length()) <= list.get(i+1).length()){
                list.remove(i);
            }else if((list.get(i).length()) > list.get(i+1).length()){
                list.remove(i+1);
            }
        }
    }

}
