import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: \n Side 1:");
        int side1 = input.nextInt();
        int side2 = side1 -1;
        int side3 = side2 -1;
        while (side2<side1){
            System.out.print("Side 2:");
            side2 = input.nextInt();
            if(side2<side1){
                System.out.print(side2+" is smaller than "+side1+". Try again.\n");
            }
        }
        while(side3<side2){
            System.out.print("Side 3:");
            side3 = input.nextInt();
            if(side3<side2){
                System.out.print(side3+" is smaller than "+side2+". Try again.\n");
            }
        }
        System.out.println("\nYour three sides are "+side1+" "+side2+" "+side3);
        int baseHeight =(side1*side1)+(side2*side2);
        int hypotenuse = (side3*side3);
        if(baseHeight == hypotenuse){
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        }else{
            System.out.println("NO!  These sides do not make a right triangle!\n");
        }
    }
}
