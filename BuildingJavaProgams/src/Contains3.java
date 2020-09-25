
/*
Write a method contains3 that accepts a List of strings as a parameter and returns true if any
single string occurs at least 3 times in the list, and false otherwise.
Use a map as auxiliary storage.
 */


import java.util.*;

public class Contains3 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<String>(Arrays.asList("asdf","hood","hds","as","ans","as","said",""));
        boolean check = contains3(list);
        System.out.println(check);
    }

    private static boolean contains3(List<String> list) {
        for(int i=0;i<list.size()-1;i++){
            int count =0;
            for(int j=1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                    if(count == 3){
                        return true;
                    }
                }
            }
        }
        return false;
    }
//    private static boolean contains3(List<String> list) {
//        Map<String, Integer> contain = new HashMap<>();
//        for (String theKey : list) {
//            if (contain.containsKey(theKey)) {
//                contain.put(theKey, contain.get(theKey) + 1);
//            } else {
//                contain.put(theKey, 1);
//            }
//        }
//
//        for (Integer theValue : contain.values()) {
//            if (theValue >= 3) {
//                return true;
//            }
//        }
//
//        return false;
//    }

}
