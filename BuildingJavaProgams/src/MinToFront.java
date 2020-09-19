import java.util.ArrayList;
import java.util.Arrays;

public class MinToFront {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer >(Arrays.asList(1,34,23,4,9,81,67,13,39,64));
        minToFront(list);
        System.out.println(list);
    }

    private static void minToFront(ArrayList<Integer> list) {
        int min = list.get(0);
        int index =0;
        for (int i =0;i<list.size();i++){
            if(list.get(i) < min){
                min = list.get(i);
                index = i;
            }
        }
        list.remove(index);
        list.add(0,min);
    }
}
