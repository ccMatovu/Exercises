import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("SQUARE ROOT! \nEnter  a number: ");
        int num = input.nextInt();
        while (num<0){
            System.out.print("You can't take the square of a negative number, silly. \nTry again: ");
            num = input.nextInt();
        }
        System.out.println("The square root of "+num+" is "+Math.sqrt(num)+".");
    }
}
