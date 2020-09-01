import java.util.Scanner;

public class WorstGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 6;
        System.out.print("TEH WORST NUMBER GUESSING GAME EVER!!!! \n\n I'M THINKING OF A NBR FROM 1-10. TRY TO GESS!");
        int guess = input.nextInt();
        if(guess==number){
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS "+number+"!");
        }else{
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+number+"!");
        }
    }
}
