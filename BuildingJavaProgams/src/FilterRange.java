import java.util.ArrayList;
import java.util.Arrays;

public class FilterRange {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7));
        int min =5;
        int max = 7;
        filterRange(list,min,max);
        System.out.println(list);
    }

    private static void filterRange(ArrayList<Integer> list, int min, int max) {
        for(int i=list.size()-1;i>=0;--i){
            int element = list.get(i);
            for(int j=min;j<=max;j++){
                if(element == j){
                    list.remove(i);
                    j=max+1;
                }
            }
    }

    }
}
