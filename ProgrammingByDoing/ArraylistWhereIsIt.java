import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraylistWhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        //int num;
        int counting =0;
        while (counting<10){
           int num = random.nextInt(50)+1;
            list.add(num);
            counting++;
        }
        System.out.println("ArrayList: "+list);
        System.out.print("Value to find: ");
        int value = scan.nextInt();
        if(list.contains(value)){
            int index = list.indexOf(value);
            System.out.println("\n"+value+" is in slot "+index);
        }else {
            System.out.println(value+" is not in the ArrayList.");
        }
        scan.close();
    }
}
