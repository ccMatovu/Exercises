import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contains3 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<String>(Arrays.asList("asdf","hood","hds","as","ans","as","said",""));
        boolean check = contains3(list);
        System.out.println(check);
    }

    private static boolean contains3(List<String> list) {
        for(int i=0;i<list.size()-1;i++){
            int count =0;
            for(int j=1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                    if(count == 3){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}
