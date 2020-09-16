import java.util.ArrayList;
import java.util.Random;

public class CopyingArraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random randomNum = new Random();

        int count =0;
        while(count<10){
            count++;
            list1.add(randomNum.nextInt(100)+1);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<10;i++){
            list2.add(i,list1.get(i));
        }
        list1.set(9,-7);
        System.out.println("ArrayList 1: "+list1);
        System.out.println("ArrayList 2: "+list2);
    }
}
