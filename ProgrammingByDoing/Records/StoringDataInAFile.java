import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.SplittableRandom;

public class StoringDataInAFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[5];
        Car car = new Car();
        for(int i =0;i<cars.length;i++){
            cars[i] = new Car();
            System.out.print("Car "+i+"\n\t\t Make: ");
            cars[i].make = scan.next();
            System.out.print("\n\t\t Model: ");
            cars[i].model = scan.next();
            System.out.print("\n\t\t Year: ");
            cars[i].year = scan.nextInt();
            System.out.print("\n\t\t License: ");
            cars[i].plateNum = scan.next();
        }
        System.out.print("\n\nTo which file do you want to save this information? ");
        File file = new File(scan.next());

        FileWriter write = new FileWriter(file);
        PrintWriter printOn = new PrintWriter(write);
        for(int i=0;i<cars.length;i++){
            printOn.print(cars[i].make+" "+cars[i].model+" "+cars[i].year+" "+cars[i].year+"\n");
        }
        printOn.close();
        write.close();
        scan.close();
        System.out.println("Data saved.");


    }
}
class Car{
    String make;
    String model;
    String plateNum;
    int year;
}
