import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number?");
        double firstNum = input.nextDouble();
        System.out.println("What is your second number?");
        double secondNum = input.nextDouble();
        System.out.println("What is your third number?");
        double thirdNum = input.nextDouble();

        System.out.println("("+firstNum+"+"+secondNum+"+"+thirdNum+")/2 is..."+(firstNum+secondNum+thirdNum)/2 );

    }
}
