import java.util.ArrayList;
import java.util.Random;

public class SortingAnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int num,count=0;
        while (count<4){
            num = random.nextInt(89)+10;
            list.add(num);
            count++;
        }
        System.out.println("ArrayList before: "+list);
        list = sortList(list);
        System.out.println("ArrayList after:  "+list);
    }

    private static ArrayList<Integer> sortList(ArrayList<Integer> list) {
        int count = 0;
        int temp;
        while(count<list.size()){
            for(int i =0; i<list.size()-1;i++){
                if((list.get(count)>list.get(i+1))){
                    temp = list.get(count);
                    list.set(count,list.get(i));
                    list.set(i,temp);
                }
            }
            count++;
        }
        return list;
    }
}
