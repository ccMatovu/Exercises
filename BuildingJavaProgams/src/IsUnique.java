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
