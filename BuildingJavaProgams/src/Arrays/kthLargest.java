package Arrays;

public class kthLargest {
    public static void main(String[] args) {
        int k =2;
        int[] values = {74, 85, 102, 99, 101, 56, 84};

        System.out.println( kthLargest(k,values));
    }

    public static int kthLargest(int k, int[] values){

        for(int i=0;i< values.length;i++){

            for(int j=i+1;j< values.length;j++){

                if(values[i] > values[j]){
                    int temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        int kthlargest =0;
        int z = values.length-1;
        while(k>-1){
            kthlargest = values[z];
            z--;
            k--;
        }

        return kthlargest;
    }
}
