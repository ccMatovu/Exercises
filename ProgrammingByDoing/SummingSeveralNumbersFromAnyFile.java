import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFile {
    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nWhich fileName would you like to read numbers from: ");
        String fileName = scan.next();
        System.out.println("Reading numbers from \"" + fileName + "\"");
        System.out.println();

        scan = new Scanner(new File(fileName));

        while(scan.hasNext()) {
            int num = scan.nextInt();
            System.out.print(num + " ");
            sum = num + sum;
        }
        System.out.println("\nTotal is " + sum + "\n");
        scan.close();
    }
}
