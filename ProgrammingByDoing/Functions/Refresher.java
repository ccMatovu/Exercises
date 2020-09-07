import java.util.Scanner;

public class Refresher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.next();
            if(name.equals("Mitchell")){

                for(int i=5; i<10;i++) {
                    System.out.println(name);
                }
            }else {
                for(int i=0; i<10;i++) {
                    System.out.println(name);
                }
            }

    }
}
