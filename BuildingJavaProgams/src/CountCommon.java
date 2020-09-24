import java.util.*;

public class CountCommon {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));

        int num = countCommon(list1,list2);
        System.out.println(num);

    }

    private static int countCommon(List<Integer> list1, List<Integer> list11) {
        int count =0;
        Set<Integer> check1 = new HashSet<Integer>(list1);
        Iterator<Integer> ite1 = check1.iterator();
        while(ite1.hasNext()){
            if(list11.contains(ite1.next())){
                count++;

            }
        }
        return count;
    }
}
