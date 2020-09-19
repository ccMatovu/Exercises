/*
Write a method doubleList that takes an ArrayList of Strings as a parameter and that
replaces every string with two of that string.
For example, if the list stores the values {"how", "are", "you?"} before the method is called,
it should store the values {"how", "how", "are", "are", "you?", "you?"}
after the method finishes executing.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class DoubleList {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<String >(Arrays.asList("Did", "you", "solve", "it", "or", "what?"));
        doubleList(list);
        System.out.println(list);
    }

    private static void doubleList(ArrayList<String> list) {
        int len = (list.size()*2);
        for(int i=0;i<len-1;i+=2){
            list.add(i,list.get(i));
        }
    }
}
