import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your height in m:");
        double height = input.nextDouble();

        System.out.print("Your weight in kg:");
        double weight = input.nextDouble();

        double bmi = weight/(height*height);
        System.out.println("Your BMI is "+bmi);

        if(bmi<18.5){
            System.out.println("BMI Category: underweight");
        }
        if((bmi >= 18.5)&&(bmi <= 24.9)){
            System.out.println("BMI Category: normal weight");
        }
        if((bmi >= 25)&&(bmi <= 29.9)){
            System.out.println("BMI Category: overweight");
        }
        if((bmi > 30)){
            System.out.println("BMI Category: obese");
        }
    }
}
