import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int mythought = random.nextInt(100)+1;
        System.out.print("I'm thinking of a number between 1-100. You have 7 guesses. \nFirst guess:");
        int count = 1;
        int maxGuesses = 7;
        int guess = input.nextInt();

        while((guess != mythought)&&(count<maxGuesses)){
            if(guess<mythought){
                System.out.println("Sorry, you are too low.");
                count++;
            }else if(guess>mythought){
                System.out.println("Sorry, you are too high.");
                count++;
            }
            System.out.print("Guess # "+count+":");
            guess = input.nextInt();
        }
        if(guess==mythought){
            System.out.println("You guessed it! What are the odds?!?");
        }else{
                System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
        }
    }
}
