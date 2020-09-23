import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveInRange2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16));
        int value =0;
        int start =5;
        int end = 13;
        removeInRange2(list,value,start,end);
        System.out.println(list);
    }

    private static void removeInRange2(List<Integer> list, int value, int start, int end) {
        for (int i = end - 1; i >= start; --i) {
            if (list.get(i) == value) {
                list.remove(i);
            }
        }

    }
}
