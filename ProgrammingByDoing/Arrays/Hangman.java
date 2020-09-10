import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words ={"god"};
        Random random = new Random();
        int getWord = random.nextInt(words.length);
        String wordToGuess = words[getWord];
        String[] compare1 = new String[wordToGuess.length()];
        String guess ="";
        String misses ="";
        String[] word = new String[wordToGuess.length()];
        for(int i=0;i<word.length;i++){
            word[i] ="-";
        }
        boolean notGuessed = true;
        Scanner scan = new Scanner(System.in);
        while (notGuessed){
            System.out.print("word:  ");
            for(int i=0;i<word.length;i++){
                System.out.print(word[i]);
            }
            System.out.println("\nMisses: "+misses+"\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.print("Guess: ");
            guess = scan.next();
            if(wordToGuess.contains(guess)){
                int index = wordToGuess.indexOf(String.valueOf(guess));
                word[index]=guess;
                compare1[index]=
                wordToGuess = wordToGuess.replaceFirst(guess,"=");

            }else{
                misses +=guess;
            }
            String compare2 =word[0];
            if((compare2.equals(compare1))){
                System.out.print("YOU GOT IT!\n\nPlay \"again\" or \"quit\"? ");
                String response = scan.next();
                if(response.equals("quit")){
                    break;
                }
            }

            System.out.println("word to guesss and compare "+wordToGuess+"  cop    "+compare1+"    cop2   "+compare2);
        }

    }
}
