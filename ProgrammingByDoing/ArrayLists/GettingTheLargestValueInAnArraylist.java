import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValueInAnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int num,count=0;
        while(count<10){
            num = random.nextInt(100)+1;
            list.add(num);
            count++;
        }
        System.out.println("ArrayList: "+list);
        count =1;
        int largest = list.get(0);

        while (count<list.size()) {
            if(largest < list.get(count)){
                largest = list.get(count);
            }
            count++;
        }
        System.out.println("\nThe largest value is "+largest);
    }
}
