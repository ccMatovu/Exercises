import java.util.Scanner;

public class LilDatabaseLoop {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<students.length;i++){
            students[i] = new Student();
            System.out.print("Enter  student "+i+"'s name: ");
            students[i].name = scan.next();
            System.out.print("Enter  student "+i+"'s grade: ");
            students[i].grade = scan.nextInt();
            System.out.print("Enter  student "+i+"'s average:  ");
            students[i].average = scan.nextDouble();

        }

        System.out.print("The names are: "+students[0].name+" "+students[1].name+" "+students[2].name+
                "\nThe grades are: "+students[0].grade+" " +students[1].grade+" "+students[2].grade+
                "\nThe averages are: " +students[0].average+" "+students[1].average+" "+students[2].average+"\n\n" +
                "The average for the three students is: "+(students[0].average+students[1].average+students[2].average)/3);

    }
}

//class Student {
//    String name;
//    int grade;
//    double average;
//}
