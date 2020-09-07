import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");
        Scanner input = new Scanner(System.in);
        boolean calculte = true;
        while (calculte){
            int user = print_menu();
            if(user == 5){
                calculte = false;
            }
            if(user ==1){
                System.out.print("Base: ");
                int base = input.nextInt();
                System.out.print("Height: ");
                int height = input.nextInt();
                double area = area_triangle(base,height);
                System.out.println("The area is "+area);
            }else if(user ==2){
                System.out.print("Length: ");
                int len = input.nextInt();
                System.out.print("Widith: ");
                int widith = input.nextInt();
                int area = area_rectangle(len,widith);
                System.out.println("The area is "+area);
            }else if(user ==3){
                System.out.print("side length: ");
                int length = input.nextInt();
                int area = area_square(length);
                System.out.println("The area is "+area);
            }else if(user == 4){
                System.out.print("Radius: ");
                int radius = input.nextInt();
                double area = area_circle(radius);
                System.out.println("The area is "+area);
            }
        }
        System.out.println("\nGoodbye");
    }
    public static int print_menu(){
        System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n1) Triangle \n2) Rectangle \n3) Square \n4) Circle" +
                "\n5) Quit \nWhich Shape: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }
    public static double area_circle(int radius){
        double area = Math.PI * (radius*radius);
        return area;
    }
    public static int area_rectangle(int length, int width){
        int area = length*width;
        return area;
    }
    public static double area_triangle( int base, int height )
    {
        int area;
        area = (base * height)/2;
        return area;
    }
    public static int area_square( int side )
    {
        int square;
        square = side * side;
        return square;
    }
}
