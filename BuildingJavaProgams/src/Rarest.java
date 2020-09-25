import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rarest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Alyssa",22);
        map.put("Char",25);
        map.put("Dan",25);
        map.put("Jeff",20);
        map.put("Kim",20);
        map.put("Stef",22);
        int rarestInt = rarest(map);
        System.out.println(rarestInt);

    }

    private static int rarest(Map<String, Integer> map) {
        List<Integer> values = new ArrayList<>();
        List<String> keys =new ArrayList<String>();
        keys.addAll(map.keySet());
        values.addAll(map.values());
        String rare ="";
        int age=0;
        int rareNum= Integer.MAX_VALUE;
        for(int i=0;i<keys.size();i++){
            int check =0;
            for(int j=0;j<values.size();j++){
                if(map.get(keys.get(i)) == values.get(j)){
                    check++;
                }
            }
            if (check < rareNum) {
                rareNum = check;
                age =map.get(keys.get(i));
                rare =keys.get(i);
            }else if(check == rareNum){
                if(age > map.get(keys.get(i))){
                    age = map.get(keys.get(i));
                }
            }
        }
        return age;

    }
}
