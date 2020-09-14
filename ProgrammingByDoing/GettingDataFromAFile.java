import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GettingDataFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which file to open: ");
        String file = scan.next();
        System.out.println("Reading data from dogs.txt");
        Dog[] dogs = new Dog[3];
        Dog doggy = new Dog();

        try {
            File text = new File(file);
            scan = new Scanner(text);
        }catch (FileNotFoundException e){
            System.out.println("file missing"+e);
        }
        for(int i=0;i<dogs.length;i++){
            dogs[i] = doggy;
            dogs[i].breed = scan.nextLine();
            dogs[i].age = scan.nextInt();
            dogs[i].weight = scan.nextDouble();

            System.out.print("First dog: "+dogs[i].breed+", "+dogs[i].age+", "+dogs[i].weight);
        }

    }
}
class Dog{
    String breed;
    int age;
    double weight;
}
