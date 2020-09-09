import java.util.Random;

public class FindingTheLargestValueInAnArray {
    public static void main(String[] args) {
        int[] num = new int[11];
        Random random = new Random();
        int ranNum;
        System.out.print("Array: ");
        for(int i=0;i<num.length;i++){
            ranNum = random.nextInt(100)+1;
            num[i] = ranNum;
            System.out.print(num[i]+" ");
        }
        int largest = num[0];
        for(int i=0; i<num.length;i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        System.out.println("\n\nThe largest value is "+largest);
    }
}
