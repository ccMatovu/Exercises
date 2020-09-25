import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HasOdd {
    public static void main(String[] args) {
        Set<Integer> set= Stream.of(0, 1, 2).collect(Collectors.toCollection(HashSet::new));
        System.out.println(hasOdd(set));
    }

    private static boolean hasOdd(Set<Integer> set) {
        for (Integer i : set) {
            if (i % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
