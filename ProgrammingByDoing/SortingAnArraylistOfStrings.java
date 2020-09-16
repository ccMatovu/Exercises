import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAnArraylistOfStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<String> wordList = Arrays.asList("ask","what","your","country","can","do","for","you");
        list.addAll(wordList);

        System.out.println("ArrayList before: "+list);
        list = sortList(list);
        System.out.println("ArrayList after:  "+list);

    }

    private static ArrayList<String> sortList(ArrayList<String> list) {
        int count = 0;
        String temp;
        String element,element2;
        while(count<list.size()){
            for(int i =count; i<list.size()-1;i++){
                element = list.get(count);
                element2 = list.get(i+1);
                if(element.charAt(0) > element2.charAt(0)){
                    temp = list.get(count);
                    list.set(count,list.get(i+1));
                    list.set(i+1,temp);
                }
            }
            count++;
        }
        return list;
    }
}
