import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the following imformation so I can sell it for a profit!");

        System.out.print("First name:");
        String firstName = input.next();
        System.out.print("last name:");
        String lastName = input.next();
        System.out.print("what grade are you in");
        int grade = input.nextInt();
        System.out.print("What is your student ID");
        int studentId = input.nextInt();
        System.out.print("Login:");
        String longIn = input.next();
        System.out.print("GPA (0.0-4.0):");
        double gpa = input.nextDouble();

        System.out.println("Your information:");
        System.out.println("\t\tLogin: "+ longIn);
        System.out.println("\t\tID:    "+ studentId);
        System.out.println("\t\tName:  "+ lastName+", "+firstName);
        System.out.println("\t\tGPA:   "+ gpa);
        System.out.println("\t\tGrade: "+ grade);
    }
}
