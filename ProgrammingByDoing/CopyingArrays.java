import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] num2 = new int[num.length];
        Random random = new Random();
        for(int i=0;i<num.length;i++){
            int randomNumber = random.nextInt(100)+1;
            num[i] = randomNumber;

        }
        System.out.print("Array 1: ");
        for(int j=0;j<num.length;j++){
            num2[j] = num[j];
            System.out.print(+num[j]+" ");
        }
        System.out.print("\nArray 2: ");
        for(int z=0; z<num.length;z++){
            System.out.print(num2[z]+" ");
        }
    }
}
