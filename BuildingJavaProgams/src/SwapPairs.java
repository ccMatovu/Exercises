import java.util.ArrayList;
import java.util.Arrays;

public class SwapPairs {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("four", "score", "and", "seven", "years"));
        swapPairs(list);
        System.out.println(list);
    }

    private static void swapPairs(ArrayList<String> list) {
        for(int i=0;i<list.size()-1;i+=2){
            String element1= list.get(i);
            String element2 = list.get(i+1);

            list.set(i,element2);
            list.set(i+1,element1);
        }
    }
}
