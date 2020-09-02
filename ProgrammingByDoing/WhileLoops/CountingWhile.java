import java.util.Scanner;

public class CountingWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();
        System.out.println("How many time do you want to print the message\nEnter Here the number:");
        int repeat = keyboard.nextInt();

        int n = 1;
        while ( n < repeat+1)
        {
            System.out.println( (n*10) + ". " + message );
            n++;
        }
    }
}
