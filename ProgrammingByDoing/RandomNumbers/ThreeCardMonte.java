import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        System.out.print("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards. \n\nWhich one is the ace?\n\n\t\t ## ## ##" +
                "\n\t\t ## ## ##\n\t\t 1  2  3 \n\n >");

        Random random = new Random();
        int hide = random.nextInt(3)+1;
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if(hide == 1){
            if(guess == 1){
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." +
                        "\n\n\t\t AA ## ## \n\t\t AA ## ## \n\t\t 1  2  3");
            }else {
                System.out.println("Ha! Fast Eddie wins again! The ace was card number " + hide + "." +
                        "\n\n\t\t AA ## ## \n\t\t AA ## ## \n\t\t 1  2  3");
            }
        }
        if(hide == 2){
            if(guess == 2){
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." +
                        "\n\n\t\t ## AA ## \n\t\t ## AA ## \n\t\t 1  2  3");
            }else {
                System.out.println("Ha! Fast Eddie wins again! The ace was card number " + hide + "." +
                        "\n\n\t\t ## AA ## \n\t\t ## AA ## \n\t\t 1  2  3");
            }
        }
        if(hide == 3){
            if(guess == 3){
                System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." +
                        "\n\n\t\t ## ## AA \n\t\t ## ## AA \n\t\t 1  2  3");
            }else {
                System.out.println("Ha! Fast Eddie wins again! The ace was card number " + hide + "." +
                        "\n\n\t\t ## ## AA \n\t\t ## ## AA \n\t\t 1  2  3");
            }
        }
    }
}
