import java.util.Scanner;

public class BasicRecords {
    public static void main(String[] args) {
        Student num1 = new Student();
        Student num2 = new Student();
        Student num3 = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first student's name: ");
        num1.name = scan.next();
        System.out.print("Enter the first student's grade: ");
        num1.grade = scan.nextInt();
        System.out.print("Enter the first Student's average: ");
        num1.average = scan.nextDouble();

        System.out.print("Enter the second student's name: ");
        num2.name = scan.next();
        System.out.print("Enter the second student's grade: ");
        num2.grade = scan.nextInt();
        System.out.print("Enter the second Student's average: ");
        num2.average = scan.nextDouble();

        System.out.print("Enter the third student's name: ");
        num3.name = scan.next();
        System.out.print("Enter the third student's grade: ");
        num3.grade = scan.nextInt();
        System.out.print("Enter the third Student's average: ");
        num3.average = scan.nextDouble();

        System.out.print("The names are: "+num1.name+" "+num2.name+" "+num3.name+"\nThe grades are: "+num1.grade+" "
                +num2.grade+" "+num3.grade+"\nThe averagees are: "+num1.average+" "+num2.average+" "+num3.average+"\n\n" +
                "The average for the three students is: "+(num1.average+num2.average+num3.average)/3);

    }
}
class Student {
    String name;
    int grade;
    double average;
}