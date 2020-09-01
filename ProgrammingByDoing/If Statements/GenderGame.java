import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your gender (M or F):");
        String gender = input.next();
        System.out.print("First name: ");
        String fName = input.next();
        System.out.print("Last name: ");
        String lName = input.next();
        System.out.print("Age: ");
        int age = input.nextInt();

        if((gender.equals("F"))&&(age>20)){
            System.out.print("Are you married, "+fName+"(y or n)?");
            String status = input.next();
            if(status.equals("y")){
                System.out.print("Then I shall call you Mrs. "+lName);
            }else{
                System.out.println("Then I shall call you Ms. "+lName);
            }
        }else if(gender.equals("F")){
            System.out.println("Then I shall call you "+fName+" "+lName);
        }else  if(gender.equals("M")&&(age>=20)){
            System.out.println("Then I shall call you Mr. "+lName);
        }else if((gender.equals("M"))&&(age<20)){
            System.out.println("Then I shall call you "+fName+" "+lName);
        }

    }
}
