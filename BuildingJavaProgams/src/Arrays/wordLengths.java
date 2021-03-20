package Arrays;

/*
* Write a method called wordLengths that accepts a Scanner representing an input
* file as its argument. Your method should read from the given file, count the
* number of letters in each token in the file, and output a result diagram of how
* many words contain each number of letters. Use tabs before the asterisks so that
*  they'll line up. If there are no words of a given length, omit that line from
* the output.*/

import java.util.Arrays;
import java.util.Scanner;

public class wordLengths {
    public static void main(String[] args) {

        int[] tokens = new int[5];
        System.out.println(Arrays.toString(tokens));

        wordLengths(new Scanner("Before sorting:\n13 23 480 -18 75\nhello how are you feeling today\n\nAfter sorting:\n-18 13 23 75 480\nare feeling hello how today you\n"));

    }

    public static void wordLengths(Scanner scan) {

        int[] tokens = new int[80];

        while(scan.hasNext()) {
            String token = scan.next();
            tokens[token.length() - 1]++;
        }

        for(int i = 0; i < tokens.length; i++) {

            if(tokens[i] > 0) {
                System.out.print((i+1) + ": " + tokens[i] + "\t");

                for(int j = 0; j < tokens[i]; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
