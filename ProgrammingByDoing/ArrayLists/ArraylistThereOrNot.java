import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistThereOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int count =0;
        while (count<10){
            int num = random.nextInt(50);
            list.add(num);
            count++;
        }
        System.out.println("ArrayList: "+list);
        System.out.print("Value to find:");
        int value = scan.nextInt();
        if(list.contains(value)){
            System.out.println("\n"+value+" is in the ArrayList.");
        }else{
            System.out.println("\n"+value+" is not in the ArrayList.");
        }
    }
}
