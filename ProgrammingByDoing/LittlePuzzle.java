import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LittlePuzzle {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Open which fileName: ");
        String fileName = scan.nextLine();
        System.out.println();

        File file = new File(fileName);
        scan = new Scanner(file);
        String allTxt=scan.nextLine();
        scan.close();

        for(int i=0; i<allTxt.length(); i++){
            if ( (i+1) % 3 == 0 )
                System.out.print( allTxt.charAt(i) );
        }
        System.out.println();
    }
}
