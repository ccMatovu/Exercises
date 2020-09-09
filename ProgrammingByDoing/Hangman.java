import java.util.Random;
import java.util.Scanner;

public interface Hangman {
    public static void main(String[] args) {
        String[] words ={"god"};
        Random random = new Random();
        int getWord = random.nextInt(words.length);
        String wordToGuess = words[getWord];
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
            }else{
                misses +=guess;
            }
            String compare ="wer";
            compare = word.toString();
            System.out.println("sdfsasdfasdfasdfasd      "+compare);

            if((compare.equals(wordToGuess))){
                System.out.print("YOU GOT IT!\n\nPlay \"again\" or \"quit\"? ");
                String response = scan.next();
                if(response.equals("quit")){
                    break;
                }
            }
        }

    }
}
