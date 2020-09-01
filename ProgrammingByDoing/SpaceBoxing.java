import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your current earth weight: ");
        double weight = input.nextDouble();

        System.out.println("I have information for the following planets: \n\t 1. Venus\t 2. Mars\t 3. Jupiter \n" +
                "\t 4. Saturn\t 5. Uranus\t 6. Neptune");

        System.out.println("Which planet are you visiting?");
        int num = input.nextInt();
        String planet;


        if(num == 1){
            planet = "Venus";
            weight = weight*0.78;
        }
        else if(num ==2){
            planet = "Mars";
            weight = weight*0.39;
        }
        else if(num == 3){
            planet = "Jupiter";
            weight = weight*2.65;
        }
        else if(num == 4){
            planet = "Saturn";
            weight = weight*1.17;
        }
        else if(num ==5){
            planet = "Uranus";
            weight = weight*1.05;
        }
        else if(num ==6){
            planet = "Neptune";
            weight = weight*1.23;
        }
        System.out.println("Your weight would be "+weight+" pounds on that planet.");

    }
}
