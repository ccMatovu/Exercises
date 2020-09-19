import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Stutter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("test1", "test2"));
        int num = 0;
        stutter(list,num);
        System.out.println(list);
    }

    private static void stutter(ArrayList<String> list, int num) {
        if(num<=0){
            list.clear();
            return;
        }
        int len =list.size();
        int skip = 0;
        for(int j=0;j<len;j++) {
            String element = list.get(skip);
            for (int i = 0; i < num-1; i++) {
                list.add(skip,element);
            }
            skip +=num;
        }
    }
}
