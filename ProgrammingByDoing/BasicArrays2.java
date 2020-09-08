import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();
        int randomNum;
        for(int i=0;i<num.length;i++){
            randomNum = random.nextInt(100)+1;
            num[i] = randomNum;
            System.out.println("Slot "+i+" contains a "+randomNum);
        }
    }
}
