import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1, enter your name: ");
        String player1 = input.next();
        System.out.print("Player 2, enter your name: ");
        String player2 = input.next();
        String choice = "";
        String currentPlayer = player1;
        int num = 0;
        while((pile1 > 0)||(pile2 > 0)||(pile3 >0)){
            System.out.print("A:"+pile1+"\t B:"+pile2+"\t C:"+pile3+"\n\n"+currentPlayer+", Choose a pile:");
            choice = input.next();
            System.out.print("How many to remove from pile "+choice+": ");
            num = input.nextInt();

            if(currentPlayer.equals(player1)){
                currentPlayer = player2;
            }else if(currentPlayer.equals(player2)){
                currentPlayer = player1;
            }
            if(choice.equals("A")){
                pile1 = pile1 -num;
            }else if(choice.equals("B")){
                pile2 = pile2 - num;
            }else if(choice.equals("C")){
                pile3 = pile3 - num;
            }
        }
        if(currentPlayer.equals(player1)){
            System.out.println(player1+", there are no counters left, so you WIN! ");
        }else if(currentPlayer.equals(player2)){
            System.out.println(player2+", there are no counters left, so you WIN! ");
        }    }
}
