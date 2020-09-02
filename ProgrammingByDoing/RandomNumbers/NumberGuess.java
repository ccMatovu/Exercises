import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int mythought = random.nextInt(10)+1;

        System.out.print("I'm thinking of a number from 1 to 10. \nYour guess: ");
        int guess = input.nextInt();
        if(guess == mythought){
            System.out.println("That's right! My secret number was "+mythought+"!");
        }else{
            System.out.println("Sorry, but I was really thinking of "+mythought+"!");
        }
    }
}
