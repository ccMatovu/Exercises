import java.util.HashMap;
import java.util.Map;

public class Intersect {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 46);
        map1.put("Kim",52);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Janet", 87);
        map2.put("Kim", 52);
        map2.put("Logan",62);
        map2.put("Lisa",83);

        Map<String,Integer> map3 = intersect(map1, map2);
        System.out.println(map3);
    }

    private static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> intersection = new HashMap<>();
        for (String key : map1.keySet()) {
            Integer value = map1.get(key);
            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                intersection.put(key, value);
            }
        }
        return intersection;
    }
}
