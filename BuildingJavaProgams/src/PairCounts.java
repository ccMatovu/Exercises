import java.util.*;

public class PairCounts {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("banana", "bends", "mend", "sandy"));
        Map<String, Integer> map = new HashMap<String, Integer>();
        map = pairCounts(list);
        System.out.println(map);
    }

    private static Map<String, Integer> pairCounts(List<String> list) {
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        for (String i : list) {
            for (int z = 0; z < i.length(); z++) {

                String check = i;
                String pair = "";
                for (int j = 0; j < 2; j++) {
                    pair += i.charAt(j);

                    if (pair.length() == 2) {
                        if (map2.containsKey(pair)) {
                            map2.put(pair, map2.get(pair) + 1);
                        } else {
                            map2.put(pair, 1);
                        }
                    }
                }
            }


        }
        return map2;
    }
}