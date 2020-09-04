import java.util.Scanner;

public class LetterAtATime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = kb.nextLine();

        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastpos = message.length() - 1;
        System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
        System.out.println("\nHere are all the characters, one at a time:\n");

        for ( int i=0; i<message.length(); i++ )
        {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
        }

        int a_count = 0;
        int e_count = 0;
        int i_count = 0;
        int o_count = 0;
        int u_count = 0;
        char letter;

        for ( int i=0; i<message.length(); i++ )
        {
             letter = message.charAt(i);
            if ( letter == 'a' || letter == 'A' )
            {
                a_count++;
            }else if ( letter == 'e' || letter == 'E' )
            {
                e_count++;
            }else if ( letter == 'i' || letter == 'I' )
            {
                i_count++;
            }else if ( letter == 'o' || letter == 'O' )
            {
                o_count++;
            }else if ( letter == 'u' || letter == 'U' )
            {
                u_count++;
            }
        }


        System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'e' " + e_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'i' " + i_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'a' " + o_count + " times. Isn't that interesting?");
        System.out.println("\nYour message contains the letter 'a' " + u_count + " times. Isn't that interesting?");


    }
}
