import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner text = new Scanner(new File("name.txt"));
        String f_name =text.next();
        String l_name =text.next();

        System.out.println( "Using my psychic powers aided by reading data from the file, I have" );
        System.out.println( "determined that your name is " +f_name+" "+l_name+"." );
        System.out.println( "Amazing, huh?" );
    }
}
