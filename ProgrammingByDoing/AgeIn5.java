import java.util.Scanner;

public class AgeIn5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = input.next();
        System.out.println("Hi, "+name+"! How old are you?");
        int age = input.nextInt();
        int futureAge = age + 5;
        int prevAge = age - 5;
        System.out.println("Did you know that in five years you will be "+futureAge+" years old?\n" +
                "And five years ago you were "+prevAge+"! Imagine that!");

    }
}
