import java.util.Scanner;

public class CalculatorP {
    public static void main (String[] args){
        double num1, num2, result;
        char function;
        Scanner keyboard = new Scanner(System.in);

        System.out.print(">");
        num1 = keyboard.nextDouble(); //Take first number as input

        System.out.print(" ");
        function = keyboard.next().charAt(0); //Takes the operator that needs to be used

        System.out.print(" ");
        num2 = keyboard.nextDouble(); //Take second number as input

        System.out.println();

        while (num1 != 0){
            //System.out.print("Ok Bye!");

            switch (function){
                case '+':
                    result = addition (num1, num2);
                    System.out.println(result);
                    break;

                case '-':
                    result = subtraction (num1, num2);
                    System.out.println(result);
                    break;

                case '*':
                    result = multiplication (num1, num2);
                    System.out.println(result);
                    break;

                case '/':
                    result = division (num1, num2);
                    System.out.println(result);
                    break;

                case '^':
                    result = exponent (num1, num2);
                    System.out.println(result);
                    break;
            }

            //Takes new input for new operation
            System.out.print(">");
            num1 = keyboard.nextDouble();

            System.out.print(" ");
            function = keyboard.next().charAt(0);

            System.out.print(" ");
            num2 = keyboard.nextDouble();

            System.out.println();
        }

        System.out.println("Ok Bye!");
    }

    //Function for addition
    public static double addition (double num1, double num2){
        double additionResult = num1 + num2;
        return additionResult;
    }

    //Function for subtraction
    public static double subtraction (double num1, double num2){
        double subtractionResult = num1 - num2;
        return subtractionResult;
    }

    //Function for multiplication
    public static double multiplication (double num1, double num2){
        double multiplicationResult = num1 * num2;
        return multiplicationResult;
    }

    //Function for division
    public static double division (double num1, double num2){
        double divisionResult = num1 / num2;
        return divisionResult;
    }

    //Function for exponent
    public static double exponent (double num1, double num2){
        double exponentResult = Math.pow(num1, num2);
        return exponentResult;
    }
}
