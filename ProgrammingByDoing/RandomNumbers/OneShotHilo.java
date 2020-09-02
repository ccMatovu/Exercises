import java.util.Random;
import java.util.Scanner;

public class OneShotHilo {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100)+1;
        Scanner input = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1-100. Try to guess it.");
        int guess = input.nextInt();

        if(num == guess){
            System.out.println("You guessed it! What ae the odds?!?");
        }else if (num > guess){
            System.out.println("Sorry, you are too low. I was thinking of "+num+".");
        }else{
            System.out.println("Sorry, you are too high. I was thinking of "+num+".");
        }
    }
}
