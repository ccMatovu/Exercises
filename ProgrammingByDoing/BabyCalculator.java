import java.util.Scanner;

public class BabyCalculator {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        String op;
        boolean calc = true;
        do
        {
            System.out.print("> ");
            a  = keyboard.nextDouble();
            op = keyboard.next();
            b  = keyboard.nextDouble();
            if(a==0){
                calc = false;
                System.out.println("Bye, now.");
            } else if (op.equals("+")){
                c = a + b;
                System.out.print("\n"+c);
             }else if(op.equals("-")){
                c = a - b;
                System.out.println(c);
            }else if(op.equals("*")){
                c = a * b;
                System.out.println(c);
            }else if(op.equals("/")){
                c = a / b;
                System.out.println(c);
            }


        } while ( calc );
    }
}
