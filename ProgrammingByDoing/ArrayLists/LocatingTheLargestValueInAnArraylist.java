import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValueInAnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int num,count=0;
        while(count<100){
            num = random.nextInt(100)+1;
            list.add(num);
            count++;
        }
        System.out.println("ArrayList: "+list);
        count =1;
        int largest = list.get(0);
        int index=0;
        while (count<list.size()) {
            if(largest < list.get(count)){
                largest = list.get(count);
                index = list.indexOf(largest);
            }
            count++;
        }
        System.out.println("\nThe largest value is "+largest+", which is in slot "+index);
    }
}
