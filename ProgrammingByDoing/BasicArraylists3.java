import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists3 {
    public static void main(String[] args) {
        ArrayList<Integer> randoms = new ArrayList<>();
        Random randomNum = new Random();

        int count =0;
        while(count<1000){
            count++;
            int num = randomNum.nextInt(89)+10;
            randoms.add(num);
        }
        System.out.println(randoms);
    }
}
