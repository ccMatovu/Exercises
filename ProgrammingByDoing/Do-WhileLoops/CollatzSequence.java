import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Starting number: ");
        int num = input.nextInt();
        System.out.print(num+"\t");
        int count = 0;
        int largest = num;
        while (num != 1){
            if(num > largest){
                largest = num;
            }
            if((num % 2) ==0){
                num = num / 2;
                System.out.print(num+"\t");
                count++;
            }else{
                num = (num*3)+1;
                System.out.print(num+"\t");
                count++;
            }
        }
        System.out.println("\n\nTerminated after "+count+" steps. The largest value was "+largest);
    }
}
