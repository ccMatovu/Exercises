import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingThreeNumbersFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        int num1, num2, num3;
        File fileToRead = new File("3nums.txt");
        Scanner input = new Scanner(fileToRead);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.println( "Reading numbers from file \"3nums.txt\"... done." );
        System.out.println();
        System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
    }
}
