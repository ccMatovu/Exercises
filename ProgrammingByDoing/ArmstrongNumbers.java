public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num1,num2,num3,sum;
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                for(int z=1;z<10;z++){
                    num1 = i*i*i;
                    num2 = j*j*j;
                    num3 = z*z*z;
                    sum = num1 + num2 + num3;
                    int number =(i * 100)+(j*10)+(z*1);
                    if(sum == number){
                        System.out.println("Armstrong Number: "+number);
                    }
                }
            }
        }
    }
}
