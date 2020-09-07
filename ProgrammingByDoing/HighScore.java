import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("You got a high score! \n\n Please enter your score: ");
        String scored = input.next();
        System.out.print("\nPlease enter your name: ");
        String name = input.next();
        System.out.println("Data stored into score.txt.");

        File sc = new File("score.txt");
        FileWriter write = new FileWriter(sc);
        PrintWriter print = new PrintWriter(write);

        print.println(name);
        print.println(scored);
        print.close();
    }
}
