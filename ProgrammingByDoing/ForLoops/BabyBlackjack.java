import java.util.Random;

public class BabyBlackjack {
    public static void main(String[] args) {
        Random random = new Random();
        int playerNum1 = random.nextInt(10)+1;
        int playerNum2 = random.nextInt(10)+1;
        int dealerNum1 = random.nextInt(10)+1;
        int dealerNum2 = random.nextInt(10)+1;
        int sumPlayer = playerNum1 + playerNum2;
        int sumDealer = dealerNum1 + dealerNum2;

        System.out.println("Baby Blackjack! \n\nYou drew "+playerNum1+" and "+playerNum2+".\nYour total is "+sumPlayer+
                ". \n\nThe dealer has "+dealerNum1+" and "+dealerNum2+". \nDealer's total is "+sumDealer+".");

        if((sumPlayer > sumDealer)){
            System.out.println("\nYOU WIN!");
        }else if(sumDealer > sumPlayer){
            System.out.println("\nYOU LOSE");
        }else{
            System.out.println("\nIt's a draw");
        }
    }
}
