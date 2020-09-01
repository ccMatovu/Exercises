import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String userName = input.next();

        System.out.println("Hi "+userName +" How old are you?");

        int age = input.nextInt();

        System.out.println("So you're "+age+", eh? That's not old at all!"+"\n"+"How much do you make, "+ userName+"?");
        int income = input.nextInt();

        System.out.println(income+"!  I hope that's per hour and not per year! LOL!");
    }
}
