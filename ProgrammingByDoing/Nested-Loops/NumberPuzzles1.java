public class NumberPuzzles1 {
    public static void main(String[] args) {
        for(int i=10;i<100;i++){
            for(int j=10;j<100;j++){
                int sum = i+j;
                int diff = j-i;
                if((sum == 60)&&(diff ==14)){
                    System.out.println(i+" , "+j);
                }
            }
        }
    }
}
