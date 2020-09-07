public class NumberPuzzles4 {
    public static void main(String[] args) {
        int sum,diff,mult,div,sum2;
        for(int i=1;i<45;i++){
            for(int j=1;j<45;j++){
                for(int z=1;z<45;z++){
                    for(int r=1;r<45;r++){
                        sum=i+2;
                        diff=j-2;
                        mult=z*2;
                        div=r/2;
                        sum2 =i+j+z+r;
                        if((sum2 ==45) && (sum ==diff)&&(diff==mult)&&(mult==div)){
                            System.out.println("The numbers are: "+i+" ,"+j+" ,"+z+" ,"+r);
                        }
                    }
                }
            }
        }

    }
}
