import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortingRecordsOnTwoFields {
    public static void main(String[] args) throws FileNotFoundException {
        Studente[] records = new Studente[30];
        Scanner scan = new Scanner(System.in);
        System.out.print("Open which file: ");
        String fileName = scan.next();
        File file = new File(fileName);
        scan = new Scanner(file);

        System.out.println("\n\nData loaded.");

        int i=0;
        while(scan.hasNext()){
            Studente student = new Studente();
            records[i] = student;
            records[i].idNum = scan.nextInt();
            records[i].gradeNum = scan.nextInt();
            records[i].grade = scan.nextDouble();
            records[i].letterGrade = scan.next();
            i++;
        }
        for(int j=0;j<records.length;j++){
           for(int z=0;z<records.length-1;z++){
               if(records[z].idNum > records[z+1].idNum){
                   Studente temp = records[z];
                   records[z] = records[z+1];
                   records[z+1] = temp;
               }
           }
        }
        System.out.println("Data sorted. \n\nHere are the sorted grades:");
        for(int r =0; r<records.length;r++){
            System.out.println(records[r].idNum+" "+records[r].gradeNum+" "+records[r].grade+" "+records[r].letterGrade);
        }
    }
}
class Studente{
    int idNum;
    int gradeNum;
    double grade;
    String letterGrade;
}
