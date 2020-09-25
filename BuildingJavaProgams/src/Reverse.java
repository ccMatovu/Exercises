import java.util.HashMap;
import java.util.Map;

public class Reverse {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(42,"Marty");
        map.put(81,"Sue");
        map.put(17,"Ed");
        map.put(31,"Dave");
        map.put(42,"Marty");
        Map<String,Integer> map2 = reverse(map);
        System.out.println(map2);
    }

    private static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String,Integer> reverseMap = new HashMap<String,Integer>();
        for(int key : map.keySet()){
            reverseMap.put(map.get(key),key);
        }
        return reverseMap;
    }
}
