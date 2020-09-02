import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        System.out.println("HERE COMES THE DICE! ");
        Random randomInt = new Random();
        int num1 = randomInt.nextInt(6)+1;
        int num2 = randomInt.nextInt(6)+1;
        int total = num1+num2;
        System.out.println("Roll #1: "+num1+"\nRoll #2: "+num2+"\nThe total is "+total+"!");
    }
}
