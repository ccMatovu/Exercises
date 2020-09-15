import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists2 {
    public static void main(String[] args) {
        ArrayList<Integer> randoms = new ArrayList<>();
        Random random = new Random();
        for(int j=0;j<100;j++){
            int ran = random.nextInt(100)+1;
            randoms.add(j,ran);
        }
        System.out.println("ArrayList: "+randoms);
    }

}
