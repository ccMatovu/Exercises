import java.util.ArrayList;
import java.util.Arrays;

public class InterLeave {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 8));
        interleave (list1,list2);
        System.out.println(list1);
        System.out.println(list2);

    }

    private static void interleave (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int len= (list1.size()+list2.size());
        int list1Len = list1.size()-1;
        int position =0;
        for (int i=0;i<len;i++){
            if(position >= list2.size()){
                return;
            }else if(position > list1Len){
                list1.add(i,list2.get(position));
            }else {
                list1.add(i + 1, list2.get(position));
                i += 1;
            }
            position++;
        }
    }
}
