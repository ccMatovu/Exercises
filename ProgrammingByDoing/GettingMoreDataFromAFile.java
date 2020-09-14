import java.io.File;
import java.util.Scanner;

public class GettingMoreDataFromAFile {
    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(System.in);
        String file;

        System.out.print( "Which file to open: " );
        file = scan.next();
        System.out.println( "Reading data from " + file + "\n" );
        File usrFile = new File(file);
        scan = new Scanner(usrFile);

        Person[] person = new Person[5];

        int i = 0;
        while ( scan.hasNext() )
        {
            person[i] = new Person();
            person[i].name = scan.next();
            person[i].age = scan.nextInt();
            i++;
        }
        scan.close();

        for ( i = 0; i < person.length; i++ ){
            System.out.println( person[i].name + " is " + person[i].age );
        }

    }
}
class Person{
    String name;
    int age;
}
