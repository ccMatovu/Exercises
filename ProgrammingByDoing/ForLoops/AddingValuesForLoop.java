import java.util.Scanner;

public class AddingValuesForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int end = input.nextInt();
        int sum=0;
        for(int i=1; i<end+1; i++){
            System.out.print(i+" ");
                sum = sum+i;
        }
        System.out.println("\nThe sum is "+sum+".");
    }
}
