/*
Write a method markLength4 that takes an ArrayList of Strings as a parameter and that places
a string of four asterisks "****" in front of every string of length 4.
For example, suppose that a variable called list contains the following values:
{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
And you make the following call: markLength4(list);
then list should store the following values after the call:
{"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
Notice that you leave the original strings in the list, "this", "lots", "Java",
but include the four-asterisk string in front of each to mark it.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MarkLength4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("four", "for ", "all "));
        markLength4(list);
        System.out.println(list);
    }

    private static void markLength4(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
            }
        }
    }
}
