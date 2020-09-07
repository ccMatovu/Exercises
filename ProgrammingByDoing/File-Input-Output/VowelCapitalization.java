import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VowelCapitalization {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Open which file: ");
        String fileName = scan.next();

        File file = new File(fileName);
        scan = new Scanner(file);
        while (scan.hasNext()){
            String fileLine = scan.nextLine();
            for ( int i = 0; i < fileLine.length(); i++ )
            {
                char c = fileLine.charAt(i);

                if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                {
                    System.out.print( Character.toUpperCase(c) );
                }
                else
                    System.out.print( c );
            }
            System.out.println();
        }

    }
}
