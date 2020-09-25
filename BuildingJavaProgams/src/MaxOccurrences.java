import java.util.*;

public class MaxOccurrences {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,45,3,55,23,4,12,15,98,87,98));
        int numTimes  = maxOccurrences(list);
        System.out.println(numTimes);
    }

    private static int maxOccurrences(List<Integer> list) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            int count =0;
            for(int j=0;j<list.size();j++){
                if(list.get(i) == list.get(j)){
                    count++;
                }
            }
            map.put(i,count);
        }
        int max = 0;
        for(int i : map.values()){
            if(i>max){
                max =i;
            }
        }
        return max;
    }
}
