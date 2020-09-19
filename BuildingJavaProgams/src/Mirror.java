import java.util.ArrayList;
import java.util.Arrays;

public class Mirror {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String >(Arrays.asList("a", "b", "c"));
        mirror(list);
        System.out.println(list);
    }

    private static void mirror(ArrayList<String> list) {
        for(int i=list.size()-1;i>=0;--i){
            String element = list.get(i);
            list.add(list.size(),element);
        }
    }
}
