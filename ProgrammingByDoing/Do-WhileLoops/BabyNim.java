import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;
        Scanner input = new Scanner(System.in);
        String choice;
        int num;
        while((pile1 > 0)||(pile2 > 0)||(pile3 >0)){
            System.out.print("A:"+pile1+"\t B:"+pile2+"\t C:"+pile3+"\t  \nChoose a pile:");
            choice = input.next();
            System.out.print("How many to remove from pile "+choice+": ");
            num = input.nextInt();

            if(choice.equals("A")){
                pile1 = pile1 -num;
            }else if(choice.equals("B")){
                pile2 = pile2 - num;
            }else if(choice.equals("C")){
                pile3 = pile3 - num;
            }
        }
        System.out.println("All piles are empty. Good job!\n");

    }
}
