import java.util.Random;

public class BasicArrays3 {
    public static void main(String[] args) {
        int[] num = new int[1000];
        Random random = new Random();
        for(int i=0; i<num.length;i++){
            int randomNumber = random.nextInt(90)+10;
            num[i] = randomNumber;
            System.out.println(num[i]+"  ");
        }
    }
}
