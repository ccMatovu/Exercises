package RandomNumbers;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        int num1 =0;
        int num2 =1;
        int total;
        System.out.println("HERE COMES THE DICE! ");
        Random randomInt = new Random();
        while(num1 != num2){
            num1 = randomInt.nextInt(6)+1;
            num2 = randomInt.nextInt(6)+1;
            total = num1+num2;
            System.out.println("Roll #1: "+num1+"\nRoll #2: "+num2+"\nThe total is "+total+"!\n");
        }
    }
}
