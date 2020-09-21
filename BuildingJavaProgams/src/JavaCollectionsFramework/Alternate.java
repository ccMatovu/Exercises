package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alternate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12));
        List<Integer> list3 = alternate(list,list2);
        System.out.println(list3);

    }

    private static List<Integer> alternate(List<Integer> list, List<Integer> list2) {
    }
}
