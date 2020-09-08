import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GradesInAnArrayAndAFile {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Name (first last): ");
        String name = input.next();
        System.out.print("Filename: ");
        String fileName = input.next();
        FileWriter file = new FileWriter(fileName);
        file.write(name+"\n");

        int[] grades = new int[5];
        Random random = new Random();
        for(int i=0;i<grades.length;i++){
            int grade = random.nextInt(100)+1;
            grades[i] = grade;
            file.write(grades[i]+" ");
        }
        file.close();
        System.out.println("\n\nData saved in \""+fileName+"\".");
    }
}
