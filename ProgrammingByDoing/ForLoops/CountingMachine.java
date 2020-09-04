import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to: ");
        int count = input.nextInt();
        for(int i=0;i<count+1;i++){
            System.out.print(i+" ");
        }
    }
}
