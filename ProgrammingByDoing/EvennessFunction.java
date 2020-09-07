public class EvennessFunction {
    public static void main(String[] args) {
        for(int i=1; i<21;i++){
            if((isDivisibleBy3(i))&&(isEven(i))){
                System.out.println(i+"<=");
            }else if(isEven(i)){
                System.out.println(i+"<");
            }else if(isDivisibleBy3(i)){
                System.out.println(i+"=");
            }else{
                System.out.println(i);
            }
        }

    }
    public static boolean isEven( int n ){
        boolean check = false;
        if((n%2)==0){
            check = true;
        }
        return check;
    }
    public static boolean isDivisibleBy3( int n ){
        boolean check = false;
        if((n%3)==0){
            check = true;
        }
        return check;
    }
}
