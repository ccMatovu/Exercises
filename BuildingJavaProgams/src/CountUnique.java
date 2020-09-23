import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountUnique {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        int num = countUnique(list);
        System.out.println(num+"   "+list);
    }

    private static int countUnique(List<Integer> list) {
        int val = new HashSet<>(list).size();;

        return val;
    }
}
