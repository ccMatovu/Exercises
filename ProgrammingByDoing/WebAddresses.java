import java.net.URL;
import java.util.Scanner;
//uncomment address class to run
//class Address
//{
//    String street;
//    String city;
//    String state;
//    int zip;
//}

public class WebAddresses
{
    public static void main(String[] args) throws Exception
    {
        URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
        Scanner fin = new Scanner( addys.openStream() );

        Address uno = new Address();
        uno.street = fin.nextLine();
        uno.city   = fin.nextLine();
        uno.state  = fin.next();
        uno.zip    = fin.nextInt();
        fin.skip("\n");

        Address dos = new Address();
        dos.street = fin.nextLine();
        dos.city   = fin.nextLine();
        dos.state  = fin.next();
        dos.zip    = fin.nextInt();
        fin.skip("\n");

        Address tre = new Address();
        tre.street = fin.nextLine();
        tre.city   = fin.nextLine();
        tre.state  = fin.next();
        tre.zip    = fin.nextInt();
        fin.skip("\n");


        Address dos2 = new Address();
        dos2.street = fin.nextLine();
        dos2.city   = fin.nextLine();
        dos2.state  = fin.next();
        dos2.zip    = fin.nextInt();
        fin.skip("\n");

        Address uno2 = new Address();
        uno2.street = fin.nextLine();
        uno2.city   = fin.nextLine();
        uno2.state  = fin.next();
        uno2.zip    = fin.nextInt();
        fin.skip("\n");
        fin.close();

        System.out.println("1. "+uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
        System.out.println("2. "+dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
        System.out.println("3. "+tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
        System.out.println("4. "+dos2.street + ", " + dos2.city + ", " + dos2.state + "  " + dos2.zip);
        System.out.println("5. "+uno2.street + ", " + uno2.city + ", " + uno2.state + "  " + uno2.zip);
    }
}