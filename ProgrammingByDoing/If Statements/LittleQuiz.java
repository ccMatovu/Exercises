import java.util.Scanner;

public class LittleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready for a quiz?");
        int points =0;
        String ans = input.next();
        System.out.println("Okay, here it comes!");

        System.out.println("Q1) What is the capital of Alsaka? \n\t\t 1) Melbourne \n\t\t 2) Anchorage " +
                "\n\t\t 3) Juneau");
        int answer = input.nextInt();
        if(answer == 3){
            System.out.println("That's right! \n\n");
            points +=1;
        }

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int? \n\t\t 1) Yes \n\t\t 2) no");
        answer = input.nextInt();
        if(answer == 2){
            System.out.println("That's right");
            points +=1;
        }
        else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers");
        }

        System.out.println("Q3 What is the result of 9+6/3?  \n\t\t 1) 5 \n\t\t 2) 11 \n\t\t 3) 15/3");
        answer = input.nextInt();
        if(answer == 2){
            System.out.println("That's correct");
            points +=1;
        }

        System.out.println("Overall, you got "+points+" out of 3 correct. \n Thanks for playing!");
    }
}

