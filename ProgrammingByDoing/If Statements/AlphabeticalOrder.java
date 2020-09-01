import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your last name?");
        String name = input.next();
        if(name.compareTo("Carswell")<=0)
        {
            System.out.println("You don't have to wait long, "+name);
        }
        else if(name.compareTo("Jones")<=0)
        {
            System.out.println("That's not bad, "+name);
        }
        else if(name.compareTo("Smith")<=0)
        {

            System.out.println("Looks like a bit of wait, "+name);
        }
        else if(name.compareTo("Young")<=0)
        {
            System.out.println("It's gonna be a while, "+name);
        }
        else if(name.compareTo("Young")>=0)
        {
            System.out.println("Not going anywhere for a while? "+name);
        }
        else{
            System.out.println("error");
        }
    }
}
