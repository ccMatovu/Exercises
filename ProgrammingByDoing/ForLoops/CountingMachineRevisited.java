import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count from: ");
        int start = input.nextInt();
        System.out.print("Count to: ");
        int end = input.nextInt();
        System.out.print("Count by: ");
        int increment = input.nextInt();

        for(int i=start;i<end+1;i+=increment){
            System.out.print(i+" ");
        }
    }
}
