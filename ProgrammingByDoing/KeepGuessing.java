import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int mythought = random.nextInt(10)+1;

        System.out.print("I have chosen a number between 1 to 10. Try to guess it. \nYour guess: ");
        int guess = input.nextInt();;

        while(guess != mythought){
            System.out.print("That is incorrect. Guess again. \nYour guess:");
            guess = input.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");

    }
}
