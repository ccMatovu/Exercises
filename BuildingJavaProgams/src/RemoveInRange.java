import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInRange {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10, 9, 8, 11));
        int start =7;
        int end = 10;
        int element = 9;
        removeInRange(list,element,start,end);
        System.out.println(list);
    }

    private static void removeInRange(ArrayList<Integer> list, int element, int start, int end) {
        for(int i=start;i<end;i++){
            int value = list.get(i);
            if((value == element)){
                list.remove(i);
                i--;
                end--;
            }
        }
    }
}
