import org.w3c.dom.ls.LSOutput;

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
