import java.util.Scanner;

public class Refresher2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.next();
        String print = name;

        for(int i=0; i<10;i++) {
            if(print.equals("Mitchell")){
                i=5;
                print = "bliff";
            }
            System.out.println(name);
        }
    }
}
