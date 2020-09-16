import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortingSentences {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Sentence: ");
        String input = scan.nextLine();

        List<String> inputWords = Arrays.asList(input.split(" "));
        for(int i=0; i<inputWords.size();i++){
            inputWords.set(i,inputWords.get(i).toLowerCase());
        }
        list.addAll(inputWords);
        list = sortList(list);
        System.out.println("Sorted: "+list);
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
