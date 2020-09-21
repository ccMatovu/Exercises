/*
Write a method mirror that accepts an ArrayList of Strings as a parameter and
produces a mirrored copy of the list as output,
with the original values followed by those same values in the opposite order.
For example, if an ArrayList variable called list contains the values ["a", "b", "c"],
after a call of mirror(list); it should contain ["a", "b", "c", "c", "b", "a"].
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Mirror {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String >(Arrays.asList("a", "b", "c"));
        mirror(list);
        System.out.println(list);
    }

    private static void mirror(ArrayList<String> list) {
        for(int i=list.size()-1;i>=0;--i){
            String element = list.get(i);
            list.add(list.size(),element);
        }
    }
}
