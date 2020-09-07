import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterRevisited {
    public static void main(String args[]) throws IOException, IOException {
        File letter = new File("letter.txt");
        FileWriter fw =new FileWriter(letter);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("+------------------------------------------------------------------+");
        pw.println("|                                                             #### |");
        pw.println("|                                                             #### |");
        pw.println("|                                                             #### |");
        pw.println("|                                                                  |");
        pw.println("|                                                                  |");
        pw.println("|                                                                  |");
        pw.println("|                                   Charles Cabral Matovu          |");
        pw.println("|                                   My address                     |");
        pw.println("|                                   My address                     |");
        pw.println("+------------------------------------------------------------------|");
        pw.close();
    }
}
