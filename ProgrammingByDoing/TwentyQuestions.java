import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TWO QUESTIONS! \n Think of an object, and I'll try to guess it");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        String guess1 = input.next();
        System.out.println("Question 2) Is it bigger than a breadbox?");
        String guess2 = input.next();

        if(guess1.equals("animal")){
            if(guess2.equals("no")){
                System.out.println("My guess is that you are thinking of a Chameleon");
            }else{
                System.out.println("My guess is that you are thinking of a Lion");
            }
        }
        else if(guess1.equals("vegetable")){
            if(guess2.equals("no")){
                System.out.println("My guess is that you are thinking of spinach");
            }else{
                System.out.println("My guess is that you are thinking of a Watermelon");
            }
        }
        else if(guess1.equals("mineral")){
            if(guess2.equals("no")){
                System.out.println("My guess is that you are thinking of a stamp");

            }else{
                System.out.println("My guess is that you are thinking of the starship enterprise");
            }
        }
        System.out.println("I would ask if I'm right, but I don't actually care");
    }
}
