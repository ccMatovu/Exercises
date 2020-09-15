import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists3 {
    public static void main(String[] args) {
        ArrayList<Integer> randoms = new ArrayList<>();
        Random randomNum = new Random();

        int count =0;
        while(count<1000){
            int num = randomNum.nextInt(89)+10;
            randoms.add(num);
            count++;
        }
        System.out.println(randoms);
    }
}
