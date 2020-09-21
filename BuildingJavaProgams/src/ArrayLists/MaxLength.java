/*Write a method maxLength that takes an ArrayList of Strings as a parameter and that returns the length
of the longest string in the list. If your method is passed an empty list, it should return 0.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxLength {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","day","today","and","collections"));
        int len = maxLength(list);
        System.out.println("the longest is "+len);
    }

    private static int maxLength(ArrayList<String> list) {
        int longest = 0;
        for(String current: list){
            if(current.length() > longest){
                longest = current.length();
            }
        }
        return longest;
    }
}
