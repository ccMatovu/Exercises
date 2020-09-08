import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();
        int randomNum;
        System.out.print("Array: ");
        for(int i=0;i<num.length;i++){
            randomNum = random.nextInt(50)+1;
            num[i] = randomNum;
            System.out.print(randomNum+" ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("\nValue to find: ");
        int value = scan.nextInt();
        boolean check = false;
        System.out.println("\n");
        for(int i=0;i<num.length;i++){
            if(value == num[i]){
                System.out.println(value+" is in slot "+i);
                check = true;
            }
        }
        if(check == false){
            System.out.println(value+" is not in the array.");
        }

    }
}
