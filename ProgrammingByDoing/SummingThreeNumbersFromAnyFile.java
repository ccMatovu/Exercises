import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingThreeNumbersFromAnyFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;
        String fileName;

        System.out.print( "Which file would you like to read numbers from: " );
        fileName = keyboard.next();
        File fileToRead = new File(fileName);
        Scanner input = new Scanner(fileToRead);
        System.out.println( "Reading numbers from file \"" + fileName + "\"\n" );

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        input.close();

        System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
    }
}
