import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        String msg = "You will find happiness with a new love";
        String msg2 = "Stick with your wife";
        String msg3 = "Your girl friend is cheating on you, she actually loves the other guy more";
        String msg4 = "Your gonna be fired in two months";
        String msg5 = "In two years, you gonna get cancer and die a painful miserable death.";
        String msg6 = "Just kill yourself already. You have a miserable existence ahead of you";

        Random random = new Random();
        int cookie = random.nextInt(6)+1;
        int num1 = random.nextInt(54)+1;
        int num2 = random.nextInt(54)+1;
        int num3 = random.nextInt(54)+1;
        int num4 = random.nextInt(54)+1;
        int num5 = random.nextInt(54)+1;
        int num6 = random.nextInt(54)+1;
        String lottoNum = String.valueOf(num1)+" - "+String.valueOf(num2)+" - "+String.valueOf(num3)+
                " - "+String.valueOf(num4) +" - "+String.valueOf(num5)+" - "+String.valueOf(num6);

        if(cookie == 1){
            System.out.println("Fortune cookie says: "+msg+"\n\t"+lottoNum);
        }else if(cookie == 2){
            System.out.println("Fortune cookie says: "+msg2+"\n\t"+lottoNum);
        }else if(cookie == 3){
            System.out.println("Fortune cookie says: "+msg3+"\n\t"+lottoNum);
        }else if(cookie == 4){
            System.out.println("Fortune cookie says: "+msg4+"\n\t"+lottoNum);
        }else if(cookie == 5){
            System.out.println("Fortune cookie says: "+msg5+"\n\t"+lottoNum);
        }else if(cookie == 6){
            System.out.println("Fortune cookie says: "+msg6+"\n\t"+lottoNum);
        }

    }
}
