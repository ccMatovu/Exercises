import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args) {
        System.out.print("TWO MORE QUESTIONS, BABY! \n\nThink of something and I'll try to guess it! \n\n" +
                "Question 1) Does it stay inside or outside or both?");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        System.out.print("Question 2) Is it a living thing?");
        String response2 = input.next();

        if((response.equals("inside"))&&(response2.equals("yes"))){
            System.out.print("\nThen what else could you be thinking of besides a rat?!");
        }
        if((response.equals("inside"))&&(response2.equals("no"))){
            System.out.print("\nThen what else could you be thinking of besides a bookshelf");
        }
        if((response.equals("outside"))&&(response2.equals("yes"))){
            System.out.print("\nThen what else could you be thinking of besides a lion");
        }
        if((response.equals("outside"))&&(response2.equals("no"))){
            System.out.print("\nThen what else could you be thinking of besides a tree");
        }
        if((response.equals("both"))&&(response2.equals("yes"))){
            System.out.print("\nThen what else could you be thinking of besides a cat");
        }
        if((response.equals("both"))&&(response2.equals("no"))){
            System.out.print("\nThen what else could you be thinking of besides shoes");
        }
    }
}
