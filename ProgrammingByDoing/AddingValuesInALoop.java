import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        System.out.println("I will add up the numbers you give me");
        System.out.print("Number: ");
        num = input.nextInt();
        int total =num;
        while (num!=0){
            System.out.println("The total so far is "+total);
            System.out.print("Number: ");
            num = input.nextInt();
            total =total+num;
        }
        System.out.println("\nThe total is "+total);
    }
}
