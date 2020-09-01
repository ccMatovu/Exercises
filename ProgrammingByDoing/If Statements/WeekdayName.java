import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        String day;
        if (num==1){
            day = "Sunday";
        }
        else if (num ==2) {
            day = "Monday";
        }
        else if(num==3){
            day = "Tuesday";
        }
        else if(num==4){
            day = "Wednesday";
        }
        else if(num==5){
            day = "Thursday";
        }
        else if(num==6){
            day = "Saturday";
        }
        else{
            day = "error";
        }

        System.out.println("Weekday "+num+": "+day);
        System.out.println("Today is a "+day+"!");

    }
}
