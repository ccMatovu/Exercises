import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadingWhatYouWrote {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[5];
        System.out.print("From which file do you want to load this information?");
        File file = new File(scan.next());
        System.out.println("Data loaded.");

        try{
            scan = new Scanner(file);
        }catch(FileNotFoundException e){
            System.out.println("file missing "+e);
        }
        System.out.println("sfdasdfasfsad");
        int i =0;
        while(scan.hasNext()){
            cars[i] = new Car();
            cars[i].make =scan.next();
            cars[i].model = scan.next();
            cars[i].year = scan.nextInt();
            cars[i].plateNum = scan.next();
            i++;
        }
        for(int j=0; j<cars.length;j++){
            System.out.print("\nCar "+j+"\n\t\t Make: "+cars[j].make+"\n\t\t Model: "+cars[j].model+
                    "\n\t\t Year: "+cars[j].year+"\n\t\t License: "+cars[j].plateNum);
        }
    }
}
