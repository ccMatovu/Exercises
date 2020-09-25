/*
Write a method isUnique that accepts a Map from strings to strings as a parameter and returns true
if no two keys map to the same value (and false if any two or more keys do map to the same value).
For example, calling your method on the following map would return true:
  {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
Calling it on the following map would return false, because of two mappings for Perkins and Reges:
  {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
The empty map is considered to be unique, so your method should return true if passed an empty map.
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsUnique {
    public static void main(String[] args) {
        Map<String, String> map1 =
                Stream.of(new String[][] {{"Marty", "Stepp"}, {"Stuart", "Reges"},{"Jessica","Miller"},{"Amanda","Camp"}})
                        .collect(Collectors.toMap(x -> x[0], x -> x[1]));
        Map<String, String> map2 =
                Stream.of(new String[][] {{"Marty", "Stepp"}, {"Stuart", "Stepp"},{"Kendrick","Perkins"}})
                        .collect(Collectors.toMap(x -> x[0], x -> x[1]));
        System.out.println(isUnique(map1));
        System.out.println(isUnique(map2));    }

    private static boolean isUnique(Map<String, String> map1) {
        int count;
        Set<String> set  = new HashSet<>();
        for(String i : map1.values()){
            set.add(i);
        }
        if(set.size() < map1.values().size()){
            return false;
        }
        return true;
    }
}
