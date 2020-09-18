/*
Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that
removes all of the strings of even length from the list.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Did", "you", "solve", "it", "or", "what?"));
        removeEvenLength(list);
        System.out.println(list);
    }

    private static void removeEvenLength(ArrayList<String> list) {
        for(int i=0;i<list.size();i++){
            String current = list.get(i);
            if((current.length() % 2) ==0){
                list.remove(i);
                i=i-1;
            }
        }
//        for (String current:list){
//           if((current.length() % 2) ==0){
//               list.remove(current);
//           }
//        }
    }
}
