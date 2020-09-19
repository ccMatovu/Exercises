/*
Write a method stutter that takes an ArrayList of Strings and an integer k as parameters and that
replaces every string with k copies of that string.
For example, if the list stores the values ["how", "are", "you?"] before the method is called
and k is 4, it should store the values
["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"]
after the method finishes executing. If k is 0 or negative, the list should be empty after the call.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Stutter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("test1", "test2"));
        int num = 3;
        stutter(list,num);
        System.out.println(list);
    }

    private static void stutter(ArrayList<String> list, int num) {
        if(num<=0){
            list.clear();
            return;
        }
        int len =list.size();
        int skip = 0;
        for(int j=0;j<len;j++) {
            String element = list.get(skip);
            for (int i = 0; i < num-1; i++) {
                list.add(skip,element);
            }
            skip +=num;
        }
    }
}
