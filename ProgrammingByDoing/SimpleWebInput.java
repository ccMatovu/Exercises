import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput {
    public static void main(String[] args) throws IOException {
        URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
        Scanner webIn = new Scanner( mcool.openStream() );

        while(webIn.hasNext()){

            String one = webIn.nextLine();

            System.out.println(one);
        }
        webIn.close();
    }
}
