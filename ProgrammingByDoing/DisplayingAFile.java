import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayingAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print( "Which file would you like to read numbers from: " );
        String fileName = input.next();

        File file = new File(fileName);
        input = new Scanner(file);

        while ( input.hasNext() )
        {
            System.out.println( input.nextLine() );
        }
    }
}
