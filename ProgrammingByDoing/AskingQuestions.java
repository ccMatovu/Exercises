import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        int heightFeet;
        int heightInces;
        double weight;

        System.out.print( "How old are you? " );
        age = keyboard.nextInt();

        System.out.print( "How tall are you? Enter only your feet " );
        heightFeet = keyboard.nextInt();

        System.out.print( "How tall are you?Now enter only the inces " );
        heightInces = keyboard.nextInt();

        System.out.print( "How much do you weigh? " );
        weight = keyboard.nextDouble();

        System.out.println( "So you're " + age + " old, " + heightFeet + "'"+heightInces+"\" tall and " + weight + " heavy." );
    }

}
